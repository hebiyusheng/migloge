 DROP TABLE  if EXISTS temp;
    CREATE TABLE temp(tablename VARCHAR(255),LieName VARCHAR(255));

    delimiter $$
    DROP procedure IF EXISTS getDataByDbName $$
    CREATE procedure getDataByDbName(in dbName VARCHAR(255),IN ziduan VARCHAR(255))
    BEGIN
    DECLARE num INT;
    SET @STMT =CONCAT("SELECT COUNT(*) FROM ",dbName," WHERE `",ziduan,"` LIKE BINARY '%中意%' INTO @num;");
    PREPARE STMT FROM @STMT;
    EXECUTE STMT;
    IF(@num>0) THEN
    INSERT INTO temp VALUES (dbName,ziduan);
    END IF;
    end$$
    delimiter ;

    delimiter $$
    DROP PROCEDURE IF EXISTS processquanjusou$$
    CREATE PROCEDURE processquanjusou()
    BEGIN
    DECLARE done BOOLEAN DEFAULT 0;
    DECLARE biao VARCHAR (255);
    DECLARE ziduan VARCHAR (255);
    DECLARE indexss CURSOR
    FOR
    SELECT TABLE_NAME,COLUMN_NAME FROM information_schema.COLUMNS WHERE TABLE_SCHEMA='zy_claim' ;
    DECLARE CONTINUE HANDLER FOR SQLSTATE '02000' SET done=1;
    OPEN indexss;
    repeat
    FETCH indexss INTO biao,ziduan;
    call  getDataByDbName(biao,ziduan);
    UNTIL done END repeat;
    CLOSE indexss;
    end$$
    delimiter ;
    CALL processquanjusou();