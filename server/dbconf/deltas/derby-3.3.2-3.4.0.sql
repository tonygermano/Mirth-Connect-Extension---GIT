CREATE TABLE CHANNEL_GROUP
	(ID VARCHAR(255) NOT NULL PRIMARY KEY,
	NAME VARCHAR(255) NOT NULL UNIQUE,
	REVISION INTEGER,
	CHANNEL_GROUP CLOB)