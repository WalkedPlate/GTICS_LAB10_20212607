-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema lab10
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema lab10
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `lab10` DEFAULT CHARACTER SET utf8 ;
USE `lab10` ;

-- -----------------------------------------------------
-- Table `lab10`.`imagen`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lab10`.`imagen` (
  `id` INT NOT NULL,
  `imagen` LONGBLOB NOT NULL,
  `nombre` VARCHAR(200) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lab10`.`tablero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lab10`.`tablero` (
  `id` INT NOT NULL,
  `dimensiones` VARCHAR(45) NULL,
  `filas` INT NOT NULL,
  `columnas` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
