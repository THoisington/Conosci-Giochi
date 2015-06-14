-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 01, 2015 at 07:28 PM
-- Server version: 5.6.21
-- PHP Version: 5.5.19

-- SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
-- SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `Games`
--

-- --------------------------------------------------------

--
-- Table structure for table `Games`
--

--CREATE TABLE IF NOT EXISTS `GAME_TABLE` (
--  `Game ID` int(200) NOT NULL,
--  `Genre` varchar(20) NOT NULL,
--  `PlayerNum` varchar(20) NOT NULL,
--  `Focus` varchar(20) NOT NULL,
--  `Graphics` varchar(20) NOT NULL,
--  `Perspective` varchar(20) NOT NULL,
--  `Publisher` varchar(20) NOT NULL,
--  `Setting` varchar(20) NOT NULL,
--  `Title` varchar(30) NOT NULL,
--  `Image` varchar(250) NOT NULL
--) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Games`
--

INSERT INTO game_table (id, dice, genre, playernum, focus, graphics, perspective, publisher, setting, title, cover) VALUES
(1, 0.0, 'puzzle', 'single', 'gameplay', 'pixel', 'side', 'indie', 'fantasy', 'Fez', 'http://static.giantbomb.com/uploads/scale_small/8/87790/2166793-box_fez.png'),
(2, 0.0, 'horror', 'single', 'story', 'realistic', 'third', 'ea', 'scifi', 'Dead Space', 'http://static.giantbomb.com/uploads/scale_small/8/82063/2529747-deadspaceclean.jpg'),
(3, 0.0, 'adventure', 'single', 'story', 'realistic', 'third', 'sony', 'modern', 'Heavy Rain', 'http://upload.wikimedia.org/wikipedia/en/thumb/c/c1/Heavy_Rain_Cover_Art.jpg/220px-Heavy_Rain_Cover_Art.jpg'),
(4, 0.0, 'wrpg', 'single', 'story', 'cartoon', 'side', 'ubisoft', 'fantasy', 'South Park: The Stick of Truth', 'http://upload.wikimedia.org/wikipedia/en/f/f3/SouthParkTheStickOfTruth.jpg'),
(5, 0.0, 'puzzle', 'single', 'exploration', 'art', 'first', 'sony', 'nature', 'Flower', 'data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxQSEhQUEhQWFhQVGBYYFBcWFRcWFBQVFBUXGBQVFRQYHCggGBolHRUUITEhJSkrLi4uGB8zODMuNygtLisBCgoKDg0OGxAQGy4lHyQsLywsLCwsLCwsMCwsLy0sLCwsLCw3LC0vLC8sLDAvLCwsLC8sLCwsLCwsLCwsLCwsLP/AABEIAPwAyAMBIgACEQE'),
(6, 0.0, 'adventure', 'single', 'story', 'cel', 'third', 'indie', 'apocalyptic', 'The Walking Dead: The Game', 'http://www.yetanotherreviewsite.co.uk/images/news/6294/boxart.jpg'),
(7, 0.0, 'strategy', 'multi', 'competition', 'other', 'top', 'other', 'scifi', 'Starcraft II', 'http://upload.wikimedia.org/wikipedia/en/2/20/StarCraft_II_-_Box_Art.jpg'),
(8, 0.0, 'puzzle', 'single', 'story', 'cel', 'third', 'atlus', 'modern', 'Catherine', 'http://gamepreorders.com/wp-content/uploads/2011/05/catherine-ps3-alternate-box-art.jpg'),
(9, 0.0, 'adventure', 'single', 'story', 'realistic', 'third', 'sony', 'global', 'Uncharted 2: Among Thieves ', 'http://www.mobygames.com/images/covers/l/277667-uncharted-2-among-thieves-playstation-3-front-cover.jpg'),
(10, 0.0, 'jrpg', 'single', 'gameplay', 'cel', 'third', 'namco bandai', 'fantasy', 'Ni No Kuni', 'http://upload.wikimedia.org/wikipedia/en/b/b9/NiNoKuni.jpg'),
(11, 0.0, 'puzzle', 'single', 'gameplay', 'other', 'first', 'valve', 'scifi', 'Portal 2', 'http://upload.wikimedia.org/wikipedia/en/f/f9/Portal2cover.jpg'),
(12, 0.0, 'shooter', 'multi', 'gameplay', 'realistic', 'first', 'valve', 'apocalyptic', 'Left 4 Dead 2', 'http://upload.wikimedia.org/wikipedia/en/b/ba/Left4Dead2.jpg'),
(13, 0.0, 'shooter', 'multi', 'competition', 'cartoon', 'first', 'valve', 'other', 'Team Fortress 2', 'http://upload.wikimedia.org/wikipedia/en/5/5f/Tf2_standalonebox.jpg'),
(14, 0.0, 'wrpg', 'single', 'exploration', 'realistic', 'first', 'other', 'apocalyptic', 'Fallout 3', 'http://vignette3.wikia.nocookie.net/fallout/images/c/c0/Fallout_3_cover_art.png/revision/20150327223914'),
(15, 0.0, 'adventure', 'multi', 'exploration', 'cartoon', 'third', 'sony', 'nature', 'Journey', 'http://www.extraguy.com/images/uploads/journey-box-art.jpg'),
(16, 0.0, 'platformer', 'multi', 'gameplay', 'cartoon', 'side', 'nintendo', 'nature', 'DKC: Tropical Freeze', 'http://upload.wikimedia.org/wikipedia/en/f/fb/DKC5_box_art.jpg'),
(17, 0.0, 'platformer', 'multi', 'gameplay', 'cartoon', 'side', 'ubisoft', 'nature', 'Rayman Legends', 'http://th01.deviantart.net/fs71/PRE/i/2012/158/b/9/rayman_legends___cover_art_2_by_squizcat-d52mzd3.jpg'),
(18, 0.0, 'platformer', 'single', 'gameplay', 'cartoon', 'side', 'indie', 'other', 'Guacamelee!', 'http://upload.wikimedia.org/wikipedia/commons/thumb/5/54/Guacamelee%21_STCE_box_art.jpg/256px-Guacamelee%21_STCE_box_art.jpg'),
(19, 0.0, 'wrpg', 'single', 'story', 'art', 'side', 'ubisoft', 'fantasy', 'Child of Light', 'http://ugdb.com/Images/boxart/Child_of_Light_art.jpg'),
(20, 0.0, 'sports', 'single', 'gameplay', 'cel', 'third', 'other', 'scifi', 'Jet Set Radio Future', 'http://xboxaddict.com/images/box_art/111.jpg'),
(21, 0.0, 'adventure', 'single', 'gameplay', 'art', 'third', 'capcom', 'fantasy', 'Okami', 'http://upload.wikimedia.org/wikipedia/en/b/be/OkamiNTSCcoverFinal.jpg'),
(22, 0.0, 'shooter', 'multi', 'competition', 'cartoon', 'third', 'nintendo', 'other', 'Splatoon', 'http://upload.wikimedia.org/wikipedia/en/archive/3/3e/20150405094546!2717093-spratoonbox.jpg'),
(23, 0.0, 'puzzle', 'single', 'gameplay', 'cartoon', 'top', 'nintendo', 'fantasy', 'Captain Toad: Treasure Tracker', 'http://media.nintendo.com/nintendo/bin/QIWETodPDS6WBtzAXzt4FpfiAxHbzxNH/zB6MZELXdQgMi1iv6G2ZK98O0j4jTxjV.png'),
(24, 0.0, 'action', 'single', 'gameplay', 'other', 'third', 'nintendo', 'fantasy', 'Bayonetta 2', 'http://i.kinja-img.com/gawker-media/image/upload/oufy3aghhkqbpv2xlnll.jpg'),
(25, 0.0, 'action', 'multi', 'competition', 'cartoon', 'side', 'nintendo', 'fantasy', 'Super Smash Bros for Wii U', 'http://img1.wikia.nocookie.net/__cb20140807220528/sonic/images/6/6f/SSBfWiiU_Box_Art.png'),
(26, 0.0, 'sports', 'multi', 'competition', 'cartoon', 'third', 'nintendo', 'fantasy', 'Mario Kart 8', 'http://upload.wikimedia.org/wikipedia/en/b/b5/MarioKart8Boxart.jpg'),
(27, 0.0, 'platformer', 'single', 'creation', 'art', 'third', 'sony', 'other', 'Tearaway', 'http://farm9.staticflickr.com/8113/8632140109_21008e1d19_o.jpg'),
(28, 0.0, 'platformer', 'multi', 'creation', 'art', 'side', 'sony', 'other', 'LittleBigPlanet 3', 'http://ecx.images-amazon.com/images/I/915sTmK8U1L._SL1500_.jpg'),
(29, 0.0, 'jrpg', 'single', 'story', 'cartoon', 'first', 'other', 'apocalyptic', 'Danganronpa', 'http://upload.wikimedia.org/wikipedia/en/2/22/Danganronpaboxart.jpg'),
(30, 0.0, 'wrpg', 'mmo', 'gameplay', 'cartoon', 'top', 'indie', 'fantasy', 'Dofus', 'http://www.lasplash.com/uploads/gift_guide/roundup_14834_Image01Upload.jpg?v=1298655592'),
(31, 0.0, 'wrpg', 'mmo', 'gameplay', 'cartoon', 'side', 'indie', 'fantasy', 'Maple Story', 'http://ugdb.com/BoxArt/Maple%20Story%20Boxart.jpg?width=240'),
(32, 0.0, 'wrpg', 'mmo', 'gameplay', 'other', 'third', 'sony', 'modern', 'DC Universe: Online', 'http://pcmedia.ign.com/pc/image/object/755/755358/DC_universe_online_final.jpg'),
(33, 0.0, 'wrpg', 'mmo', 'gameplay', 'realistic', 'third', 'ea', 'scifi', 'Star Wars: The Old Republic', 'http://upload.wikimedia.org/wikipedia/en/3/3c/Star_Wars-_The_Old_Republic_cover.jpg'),
(34, 0.0, 'adventure', 'mmo', 'exploration', 'other', 'first', 'indie', 'scifi', 'No Man''s Sky', 'http://www.allertonave.com/webhook-uploads/1410036472994_1409601994928_DerekBrown_NoMansSky_Poster-13.jpg'),
(35, 0.0, 'wrpg', 'mmo', 'creation', 'other', 'third', 'indie', 'modern', 'Second Life', 'http://download.gamezone.com/uploads/image/data/873339/box_large_second_life.jpg'),
(36, 0.0, 'strategy', 'single', 'gameplay', 'pixel', 'top', 'nintendo', 'fantasy', 'Fire Emblem: Sacred Stones', 'http://lahalliday.blog.com/files/2013/01/fire-emblem-sacred-stone.jpg'),
(37, 0.0, 'jrpg', 'mmo', 'story', 'other', 'third', 'other', 'fantasy', 'Final Fantasy XIV:ARR', 'http://www.lightninggamingnews.com/wp-content/uploads/2013/05/Final-Fantasy-XIV-A-Realm-Reborn-Box-Art-Collector%E2%80%99s-Edition-and-pre-order-incentives-announced-3-724x1024.jpg'),
(38, 0.0, 'action', 'single', 'gameplay', 'pixel', 'top', 'indie', 'modern', 'Hotline Miami', 'http://ecx.images-amazon.com/images/I/91rCxkzbxDL._SL1500_.jpg'),
(39, 0.0, 'platformer', 'single', 'creation', 'cartoon', 'side', 'sony', 'other', 'Sound Shapes', 'http://images.onehitpixel.com/2012/09/soundshapesbox.jpg'),
(40, 0.0, 'jrpg', 'single', 'story', 'cartoon', 'top', 'atlus', 'modern', 'Persona 3: Portable', 'http://cache.gawkerassets.com/assets/images/9/2010/01/500x_boxart.jpg'),
(41, 0.0, 'strategy', 'single', 'gameplay', 'cel', 'top', 'nintendo', 'fantasy', 'Fire Emblem: Path of Radiance', 'http://upload.wikimedia.org/wikipedia/en/a/a5/Fire_Emblem_PoR_Boxart.JPG'),
(42, 0.0, 'jrpg', 'single', 'gameplay', 'other', 'first', 'atlus', 'fantasy', 'Shin Megami Tensei IV', 'http://img2.wikia.nocookie.net/__cb20130312154220/megamitensei/images/2/2d/SMTIV_Cover_Large.png'),
(43, 0.0, 'sports', 'single', 'gameplay', 'cartoon', 'third', 'sony', 'nature', 'Hot Shots Golf', 'http://upload.wikimedia.org/wikipedia/en/thumb/b/bb/Everybodys_Golf_6_cover.png/220px-Everybodys_Golf_6_cover.png'),
(44, 0.0, 'shooter', 'multi', 'competition', 'realistic', 'first', 'ea', 'global', 'Battlefield 2: Bad Company', 'http://upload.wikimedia.org/wikipedia/en/b/b3/Battlefield_Bad_Company_2_cover.jpg'),
(45, 0.0, 'action', 'multi', 'competition ', 'cartoon', 'top', 'other', 'fantasy', 'League of Legends', 'http://download.gamezone.com/uploads/product/boxart/75178/box_large_leagueoflegendsbox1.jpg'),
(46, 0.0, 'jrpg', 'single', 'story', 'cel', 'side', 'namco bandai', 'fantasy', 'Tales of Vesperia', 'http://upload.wikimedia.org/wikipedia/en/archive/d/dc/20141027102457!Tales_of_Vesperia_Game_Cover.jpg'),
(47, 0.0, 'platformer', 'single', 'gameplay', 'art', 'side', 'nintendo', 'fantasy', 'Yoshi''s Wooly World', 'https://sickr.files.wordpress.com/2015/04/yoshis_woolly_world_na_boxart.jpg?w=660'),
(48, 0.0, 'shooter', 'single', 'story', 'realistic', 'first', 'valve', 'scifi', 'Half Life 2', 'http://upload.wikimedia.org/wikipedia/en/2/25/Half-Life_2_cover.jpg'),
(49, 0.0, 'shooter', 'single', 'story', 'other', 'first', 'sony', 'apocalyptic', 'Resistance 3', 'http://upload.wikimedia.org/wikipedia/en/8/8b/Resistance_3_box_artwork.png'),
(50, 0.0, 'adventure', 'single', 'exploration', 'pixel', 'first', 'indie', 'nature', 'Proteus', 'http://pressja.wsiz.pl/wp-content/uploads/2013/05/proteus-box-art.png'),
(51, 0.0, 'action', 'multi', 'competition', 'pixel', 'side', 'indie', 'fantasy', 'Towerfall: Ascension ', 'http://static.giantbomb.com/uploads/original/1/15063/2624191-boxart_520x790.jpg'),
(52, 0.0, 'puzzle', 'single', 'gameplay', 'cartoon', 'third', 'namco bandai', 'nature', 'Katamari Forever', 'http://upload.wikimedia.org/wikipedia/en/1/14/Katamari_Forever_cover.jpg'),
(53, 0.0, 'sports', 'multi', 'competition', 'cartoon', 'third', 'atlus', 'nature', 'Snowboard Kids', 'http://static.giantbomb.com/uploads/original/8/87790/2199370-box_sbk64.png'),
(54, 0.0, 'sports', 'multi', 'competition', 'realistic', 'third', 'ea', 'modern', 'Madden 09', 'http://multiplayerblog.mtv.com/wp-content/uploads/2008/08/maddennfl09.jpg'),
(55, 0.0, 'sports', 'single', 'gameplay', 'realistic', 'third', 'ea', 'modern', 'Skate 3', 'http://cdn1-www.playstationlifestyle.net/assets/uploads/2010/02/skate-3-ps3-boxart.jpg'),
(56, 0.0, 'sports', 'single', 'gameplay', 'other', 'third', 'ea', 'nature', 'SSX', 'http://www.gamepur.com/files/imagepicker/48/ssx-ps3-box-art.jpg'),
(57, 0.0, 'strategy', 'single', 'creation', 'cartoon', 'top', 'ea', 'nature', 'Spore', 'http://upload.wikimedia.org/wikipedia/en/7/77/Sporebox.jpg'),
(58, 0.0, 'jrpg', 'single', 'story', 'art', 'side', 'nintendo', 'other', 'Paper Mario', 'http://www.gamershell.com/static/boxart/large/8379.jpg'),
(59, 0.0, 'horror', 'single', 'story', 'other', 'third', 'capcom', 'nature', 'Resident Evil 4', 'http://static.giantbomb.com/uploads/original/0/5512/870950-resident_evil_4_box_pal.jpg'),
(60, 0.0, 'horror', 'single', 'story', 'other', 'first', 'indie', 'scifi', 'Amnesia: A Machine for Pigs', 'http://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Amnesiaamachineforpigscoverart.jpg/220px-Amnesiaamachineforpigscoverart.jpg'),
(61, 0.0, 'strategy', 'multi', 'competition', 'cartoon', 'top', 'valve', 'fantasy', 'Dota 2', 'http://www.bazicenter.com/files/games/orig_1331092332.jpg'),
(62, 0.0, 'horror', 'single', 'exploration', 'other', 'first', 'indie', 'nature', 'Slender', 'http://static.giantbomb.com/uploads/original/15/155745/2290330-slender_cover_art.jpg'),
(63, 0.0, 'action', 'multi', 'story', 'realistic', 'third', 'ubisoft', 'scifi', 'Assasin''s Creed: Unity', 'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRhyOY776Z-pelUQkIWeEtxzoDTCqcZlAsLD5Ksu8GNniZR8gUM'),
(64, 0.0, 'horror', 'multi', 'story', 'realistic', 'third', 'capcom', 'modern', 'Resident Evil 5', 'http://img2.wikia.nocookie.net/__cb20131123200125/epicrapbattlesofhistory/images/b/b7/Resident-evil-5-box-art.jpg'),
(65, 0.0, 'shooter', 'multi', 'competition', 'realistic', 'first', 'other', 'global', 'Call of Duty: Modern Warfare', 'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTCXOC8DpZdQuYKSaRBRA3liE-HKO2NmUle6azNwljn1o63aUUuE_fb8g'),
(66, 0.0, 'puzzle', 'single', 'gameplay', 'other', 'first', 'indie', 'scifi', 'Dyad', 'http://images.onehitpixel.com/2012/08/dyadbox.jpg'),
(67, 0.0, 'shooter', 'single', 'gameplay', 'pixel', 'first', 'other', 'scifi', 'Doom', 'http://upload.wikimedia.org/wikipedia/en/5/57/Doom_cover_art.jpg'),
(68, 0.0, 'shooter', 'multi', 'exploration', 'other', 'first', 'other', 'scifi', 'Destiny', 'http://assets.vg247.com/current//2013/09/Destiny-Box-Art-Reveal.jpg'),
(69, 0.0, 'action', 'single', 'gameplay', 'pixel', 'top', 'other', 'modern', 'Grand Theft Auto 2', 'http://upload.wikimedia.org/wikipedia/en/thumb/2/2e/GTA2_Box_art.jpg/250px-GTA2_Box_art.jpg'),
(70, 0.0, 'puzzle', 'multi', 'competition', 'pixel', 'top', 'namco bandai', 'other', 'Pac-Man: Championship Edition', 'http://upload.wikimedia.org/wikipedia/en/7/74/Pacmancelogo.png');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Games`
--
--ALTER TABLE `GAME_TABLE`
 --ADD PRIMARY KEY (`Game ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
