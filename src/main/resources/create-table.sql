/**
 * This table has all school updates related data.
*/
CREATE TABLE `school-dashboard`.`school_updates` (
  `uid` INT NOT NULL AUTO_INCREMENT,
  `subject` VARCHAR(1024) NOT NULL,
  `meeting_date` TIMESTAMP NULL DEFAULT NOW(),
  `contact_person` VARCHAR(50) NULL,
  `attendance_count` INT NULL DEFAULT 0,
  `meeting_accepted_count` INT NULL DEFAULT 0,
  `meeting_audience` INT NULL DEFAULT 0,
  PRIMARY KEY (`uid`))
COMMENT = 'This table has all school updates related data.';

/**
 * Altering table to change behavior of meeting audience value is - STUDENTS OR PARENTS
*/

ALTER TABLE `school-dashboard`.`school_updates` 
CHANGE COLUMN `meeting_audience` `meeting_audience` VARCHAR(100) NULL DEFAULT '0' ;

/**
* Table to store school notice update info point by point
*/
CREATE TABLE `school-dashboard`.`notice_info` (
  `uid` INT NOT NULL AUTO_INCREMENT,
  `time` DATETIME NOT NULL,
  `subject` VARCHAR(512) NOT NULL,
  `more_details` LONGTEXT NULL,
  `detail_type` VARCHAR(45) NULL DEFAULT 'INFO',
  PRIMARY KEY (`uid`))
COMMENT = 'Table to store school notice update info point by point';
