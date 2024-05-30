
-- leaderboards.players definition

CREATE TABLE `players` (
  `playerId` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `mmr` bigint DEFAULT NULL,
  `position` int DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`playerId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;