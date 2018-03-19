-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Lun 19 Mars 2018 à 17:37
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `pharmacie`
--
CREATE DATABASE IF NOT EXISTS `pharmacie` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `pharmacie`;

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

CREATE TABLE IF NOT EXISTS `fournisseur` (
  `id_fournisseur` int(11) NOT NULL AUTO_INCREMENT,
  `adresse` varchar(100) NOT NULL,
  `ville` varchar(50) NOT NULL,
  `pays` varchar(50) NOT NULL,
  `num_tel` bigint(20) NOT NULL,
  `nom_fournisseur` varchar(100) NOT NULL,
  `quantite` int(11) NOT NULL,
  PRIMARY KEY (`id_fournisseur`),
  KEY `nom_fournisseur` (`nom_fournisseur`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `fournisseur`
--

INSERT INTO `fournisseur` (`id_fournisseur`, `adresse`, `ville`, `pays`, `num_tel`, `nom_fournisseur`, `quantite`) VALUES
(1, 'Hlm', 'Dakar', 'Senegal', 770031293, 'DiayGarab', 90);

-- --------------------------------------------------------

--
-- Structure de la table `medicament`
--

CREATE TABLE IF NOT EXISTS `medicament` (
  `id_medicament` int(11) NOT NULL,
  `nom_medicament` varchar(100) NOT NULL,
  `quantite` int(11) NOT NULL,
  `nom_fournisseur` varchar(100) NOT NULL,
  `prix` int(11) NOT NULL,
  `date_expiration` date NOT NULL,
  PRIMARY KEY (`id_medicament`),
  KEY `nom_fournisseur` (`nom_fournisseur`),
  KEY `nom_medicament` (`nom_medicament`),
  KEY `date_expiration` (`date_expiration`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `pharmacien`
--

CREATE TABLE IF NOT EXISTS `pharmacien` (
  `identifiant` varchar(255) NOT NULL,
  `mdp` varchar(255) NOT NULL,
  `prenom` varchar(100) NOT NULL,
  `nom` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `pharmacien`
--

INSERT INTO `pharmacien` (`identifiant`, `mdp`, `prenom`, `nom`) VALUES
('cherif', 'passer', '', ''),
('abdoujunior', 'passer', 'Abdou Khadre Jeylani', 'Drame');

-- --------------------------------------------------------

--
-- Structure de la table `stat`
--

CREATE TABLE IF NOT EXISTS `stat` (
  `date` date NOT NULL,
  `quantite_vendu` int(11) NOT NULL,
  `prix_total` int(11) NOT NULL,
  PRIMARY KEY (`date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `vente`
--

CREATE TABLE IF NOT EXISTS `vente` (
  `id_vente` int(11) NOT NULL AUTO_INCREMENT,
  `date_vente` date NOT NULL,
  `id_client` int(11) NOT NULL,
  `medicament` varchar(100) NOT NULL,
  `quantite` int(11) NOT NULL,
  `date_expiration` date NOT NULL,
  PRIMARY KEY (`id_vente`),
  KEY `medicament` (`medicament`),
  KEY `date_expiration` (`date_expiration`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `medicament`
--
ALTER TABLE `medicament`
  ADD CONSTRAINT `fk_fournisseur_medicament` FOREIGN KEY (`nom_fournisseur`) REFERENCES `fournisseur` (`nom_fournisseur`);

--
-- Contraintes pour la table `vente`
--
ALTER TABLE `vente`
  ADD CONSTRAINT `fk_medicament_vente_expire` FOREIGN KEY (`date_expiration`) REFERENCES `medicament` (`date_expiration`),
  ADD CONSTRAINT `fk_medicament_Vente` FOREIGN KEY (`medicament`) REFERENCES `medicament` (`nom_medicament`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
