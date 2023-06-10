BEGIN;

-- CREATE TABLE "tickets" --------------------------------------
CREATE TABLE "public"."tickets" ( 
	"id" SERIAL PRIMARY KEY,
	"reporter" VARCHAR( 100 ) NOT NULL,
	"date" Timestamp Without Time Zone NOT NULL,
	"deadline" Timestamp Without Time Zone NOT NULL,
	"status" INT NOT NULL,
	"item" VARCHAR( 100 ) NOT NULL,
	"description" Text NOT NULL,
	"assignee" VARCHAR( 100 ) NOT NULL,
    "severity" INT NOT NULL,
	CONSTRAINT "unique_tickets_Id" UNIQUE( "id" ) );
 ;
-- -------------------------------------------------------------

COMMIT;
