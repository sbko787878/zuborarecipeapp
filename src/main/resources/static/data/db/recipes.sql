/*M!999999\- enable the sandbox mode */ 
-- MariaDB dump 10.19  Distrib 10.5.27-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: zubora_recipes
-- ------------------------------------------------------
-- Server version	10.5.27-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `zubora_recipes`
--

DROP TABLE IF EXISTS `zubora_recipes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zubora_recipes` (
  `id` int(11) NOT NULL,
  `name` varchar(250) NOT NULL,
  `description` text NOT NULL,
  `material` text NOT NULL,
  `image_Path` varchar(250) NOT NULL,
  `icon` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zubora_recipes`
--

LOCK TABLES `zubora_recipes` WRITE;
/*!40000 ALTER TABLE `zubora_recipes` DISABLE KEYS */;
INSERT INTO `zubora_recipes` VALUES (1,'レンチン一回\n簡単オムライス','1.レンチンOKな容器に☆の材料を入れ、よく混ぜる\n2.ピザ用チーズをお好みでかける\n3.△の材料を他の容器に入れて混ぜ、☆にかける\n4.3分レンチンし、最後にケチャップをかけたら完成。','☆ごはん　130ｇ☆ツナ缶　1缶(オイルは切る)☆ケチャップ　大さじ2・ピザ用チーズ　お好みで△全卵　1個△牛乳　20ｍｌ△塩コショウ　適量','①.png','gohan.png tunakan.png chi-zu.png tamago.png gyuunyuu.png'),(2,'レンチン1回\nコク旨バタぽんパスタ','1.レンチンＯＫな容器にパスタ、お水を加える\n2.パスタの袋に記載された加熱時間+2分レンチン\n3.ゆで汁大さじ1程度残した状態で☆を入れる\n4.よく混ぜたら完成。','・パスタ100ｇ・水250ｍｌ☆有塩バター　15ｇ☆ツナ缶　1缶(オイルは切る)☆ニンニクチューブ　2-3cm☆ポン酢　大さじ2☆刻みネギ　好きなだけ☆ゴマ　好きなだけ','②.png','gohan.png tunakan.png chi-zu.png tamago.png gyuunyuu.png'),(3,'レンチン1回\n和風ツナマヨパスタ','1.レンチンＯＫな容器に☆の材料を入れる\n2.パスタの湯で時間+2分レンチン\n3.パスタに・の材料を入れ、よく混ぜて完成。','☆パスタ　100ｇ☆水　230ｍｌ☆ツナ缶　1缶(オイルごと)☆塩昆布　2つまみ☆鶏ガラ　小さじ1・マヨネーズ　大さじ2・鰹節　1パック・刻みネギ　好きなだけ','③.png','pasta.png tunakan.png konnbu.png tori.png'),(4,'生クリームなし！\n明太クリームパスタ','1.レンチンＯＫな容器に☆の材料を入れる\n2.パスタの湯で時間+2分レンチン\n3.パスタに・の材料を入れ、よく混ぜて完成。','☆パスタ　100ｇ☆水　200ｍｌ☆鶏ガラ　小さじ1☆サラダ油　小さじ1・マヨネーズ　大さじ1.5・明太子　50ｇ・牛乳　大さじ4','④.png','pasta.png tori.png menntaiko.png gyuunyuu.png'),(5,'洗い物1つ\n瞬殺パスタ','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間+3分レンチン\n3.パスタに・の材料を入れ、よく混ぜて完成。','☆パスタ　100ｇ☆水　250ｍｌ☆鶏ガラ　小さじ1☆ニンニク　3-5cm☆赤唐辛子　お好みで☆オリーブオイル　小さじ2☆塩　少々・めんつゆ(3倍濃縮)　小さじ1・大葉　好きなだけ・黒コショウ　少々','⑤.png','pasta.png tori.png ninnniku.png'),(6,'仕事終わりでも作れる\nトマたまパスタ','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間+2分レンチン\n3.パスタに・の材料を入れ、よく混ぜて完成。','☆パスタ　100ｇ☆水　250ｍｌ☆コンソメ　小さじ1/2☆オリーブオイル　大さじ1☆ケチャップ　大さじ2☆ベーコン　お好みで☆ニンニク　2-3cm・有塩バター　10ｇ・全卵　1つ','⑥.png','pasta.png konnsome.png be-kon.png ninnniku.png bata-.png tamago.png'),(7,'材料入れてレンチンするだけ\nボンゴレビアンコ','1.レンチンOKな容器に全ての材料を入れる\n2.パスタの湯で時間+3分レンチン\n3.よく混ぜて完成。','・パスタ　80ｇ・水　180ml・ニンニクチューブ　2-5cm・ベーコン(ハーフタイプ) 　2枚・鷹の爪　お好みで・オリーブオイル　大さじ1・コンソメ　小さじ1/2・塩コショウ　適量・冷凍あさり　お好みで','⑦.png','pasta.png ninnniku.png be-kon.png konnsome.png kai.png'),(8,'材料入れてレンチンするだけ\nさば缶和風パスタ','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間+3分レンチン\n3.よく混ぜてお好みでネギを入れて完成。','☆パスタ　８０ｇ☆水　１６０ml☆サバ缶（缶汁は含めない）　１００ｇ☆玉ねぎ　５０ｇ☆オリーブオイル　大さじ１☆レモン汁　小さじ１☆醤油　大さじ１☆ブラックペッパー　適量・ネギ　お好みで','⑧.png','pasta.png tunakan.png tamanegi.png negi.png'),(9,'材料入れてレンチンするだけ\n貧乏人のパスタ','1.レンチンOKな容器に☆の材料を入れる\n2.卵の黄身をつぶす\n3.パスタの湯で時間+6分レンチン\n4.卵とパスタをほぐす\n5.残りをお好みでかけて完成','☆パスタ　８０ｇ☆水　１８０ml☆オリーブオイル　大さじ１強☆ニンニクチューブ　2-5cm☆卵　1個・粉チーズ　大さじ２～３・塩　お好みの味に調整・ブラックペッパー　適量','⑨.png','pasta.png ninnniku.png tamago.png chi-zu.png'),(10,'材料入れてレンチンするだけ\nじゃこと野沢菜の納豆パスタ','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間+3分レンチン\n3.納豆を付属のタレを入れて混ぜる\n4.レンチンしたパスタに乗せて完成。','☆パスタ　８０ｇ☆水　１８０ml☆野沢菜の漬物　５０ｇ☆じゃこ　１０ｇ☆鶏ガラスープの素小さじ１/２☆ごま油　小さじ２☆おろし生姜　小さじ１/２☆輪切り鷹の爪　お好みで・納豆　１パック・ネギ　お好みで','⑩.png','pasta.png sakana.png tori.png negi.png'),(11,'材料入れてレンチンするだけ\nツナとキムチのバターパスタ','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間+3分レンチン\n3.全体を混ぜてお好みで糸唐辛子を入れて完成。','☆パスタ　８０ｇ☆水　１５０ml☆キムチ　１００ｇ☆ツナ缶（オイル）１缶☆コチュジャン　大さじ１☆バター　１５ｇ・あれば糸唐辛子　適量','⑪.png','pasta.png tunakan.png bata-.png'),(12,'材料入れてレンチンするだけ\n和風きのこパスタ','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間+3分レンチン\n3.全体を混ぜてお好みで大葉を載せて完成。','☆パスタ　８０ｇ☆水　１８０ml☆椎茸　２個☆ベーコン（ハーフタイプ）２枚☆鶏ガラスープの素小さじ１/２☆醤油　小さじ１☆ごま油　大さじ１☆おろしにんにく　小さじ１/２・大葉　３枚','⑫.png','pasta.png kinoko.png be-kon.png tori.png ninnniku.png'),(13,'仕事終わりでも作れる\n海苔ボナーラ','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間+2分レンチン\n3.残りの材料を入れる\n4.空気を含ませるように全体を混ぜて完成。','☆パスタ　100g☆水　230ml☆鶏ガラの素　小さじ1☆にんにく　3㎝程☆ごま油　大さじ1・卵　1個・マヨネーズ　大さじ2・韓国海苔　1パック','⑬.png','pasta.png tori.png ninnniku.png tamago.png'),(14,'仕事終わりでも作れる\n白菜クリームパスタ','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間+2分レンチン\n3.残りの材料を入れる全体を混ぜて完成。\n(水分が多いと感じるときには1分ほど馴染ませる)','☆パスタ　100g☆ツナ缶　1/2缶(油ごと)☆白菜　1枚☆にんにく　2cm☆鶏ガラの素　小さじ1☆水　200ml・マヨネーズ　大さじ2・牛乳　大さじ2','⑭.png','pasta.png tunakan.png ninnniku.png tori.png gyuunyuu.png'),(15,'仕事終わりでも作れる\nキムたまボナーラ','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間+2分レンチン\n3.残りの材料を入れる\n4.空気を入れるように全体を混ぜて完成。','☆パスタ　100g☆水　230ml☆鶏ガラの素　小さじ1☆にんにく　3㎝程☆ごま油　大さじ1・卵　1個・チーズ　30・キムチ　50g','⑮.png','pasta.png tori.png ninnniku.png tamago.png chi-zu.png'),(16,'レンジで簡単\n濃厚チーズパスタ','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間レンチン\n3.チーズ、牛乳を加えさらに2分レンチン\n4.お好みでブラックペッパーをかけて完成。','☆パスタ　100g☆水　200ml☆コンソメの素　大さじ1/2☆バター　1かけ・牛乳　100ml・とろけるチーズ　80g・ブラックペッパー　お好みで','⑯.png','pasta.png konnsome.png gyuunyuu.png chi-zu.png'),(17,'仕事終わりでも作れる\nピリ辛シーフードパスタ','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間+2分レンチン\n3.お好みでパセリを散らして完成。','☆乾麺パスタ　80g☆オリーブオイル　小さじ2☆トマトジュース　200ml☆水　50ml☆コンソメ　小さじ2☆一味　お好み☆シーフードミックス　お好み☆玉ねぎ　30g・パセリ　お好み','⑰.png','pasta.png tomato.png konnsome.png kai.png ebi.png tamanegi.png'),(18,'レンチンして混ぜるだけ\n和風クリームパスタ','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間+2分レンチン\n3.マヨネーズを加え全体をよく混ぜる\n4.お好みで大葉、すりごまを散らして完成。','☆パスタ　100g☆水　230ml☆冷凍海老　6個☆鶏ガラの素　小さじ1☆醤油　小さじ1☆油　小さじ1・マヨネーズ　大さじ2・大葉　お好みで・すりごま　お好みで','⑱.png','pasta.png ebi.png tori.png'),(19,'材料入れてレンチンするだけ\n貧乏人のパスタ','1.レンチンOKな容器に☆の材料を入れる\n2.5分レンチン。\n3.有塩バターを加え全体をよく混ぜ、完成。','☆冷凍うどん　１玉☆牛肉or豚肉　50g☆しめじ　50g☆醤油　大さじ1☆砂糖　　大さじ1・有塩バター　10g','⑲.png','udon.png ushi.png kinoko.png bata-.png'),(20,'ズボラでも高見え\nレンチンボロネーゼ','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間レンチン。\n3.ケチャップ、ウスターソースを入れて混ぜる\n4.追加で4分レンチン。\n5.全体をよく混ぜ完成。','☆パスタ　100g☆水　220cc☆粗挽き肉　100g☆玉ねぎ　1/2個☆コンソメ　大さじ1☆ニンニクチューブ　小さじ1☆オリーブオイル　大さじ1/2☆塩コショウ　適量・ケチャップ　大さじ2.5(加熱して酸味飛ばす)・ウスターソース　大さじ1・粉チーズ　適量・パセリ　適量','⑳.png','pasta.png ushi.png tamanegi.png konnsome.png ninnniku.png chi-zu'),(21,'生クリーム不要\nクリームうどん','1.レンチンOKな容器に☆の材料を入れる\n2.うどんの規定時間時間レンチン\n3.全体をよく混ぜ、牛乳をかけて混ぜて完成。','☆冷凍うどん　1玉☆マヨネーズ　大さじ2☆韓国のり　3.4枚(3g)☆オイスターソース　小さじ1(ない時は醤油小さじ1/2)☆にんにく　2センチ☆有塩バター　10g・牛乳　大さじ2','㉑.png','udon.png ninnniku.png bata-.png'),(22,'レンジで簡単\nぷるぷる茶碗蒸し','1.マグカップに卵を割り入れ溶く\n2.めんつゆ、水を入れ混ぜる\n3.ふんわりラップをして200W10分加熱\n4.1分蒸らしたら完成。\n(ゆるい場合には様子を見ながら10秒ずつ加熱する)','・卵（1個）・水（150cc）・めんつゆ2倍濃縮（大さじ1）・ちくわ・三つ葉(具材はお好みで)','㉒.png','tamago.png'),(23,'本当は教えたくない\nとん平焼き','1.ラップを引いた平皿に溶き卵(2個)を入れる\n2.豚肉、もやしを載せ、塩コショウをかける\n3.ラップをし600W4分加熱し粗熱で火を通す\n4.形を整え、ソースなどをトッピングし完成。','☆卵　２個☆もやし　1/2袋☆豚肉　40g☆塩胡椒　少々・ソース　お好みで・マヨネーズ　お好みで・かつお節　お好みで・青のり　お好みで','㉓.png','tamago.png buta.png'),(24,'レンチン７分\nヘルシー麻辣湯','1.レンチンOKな容器に☆の材料を入れる\n2.600W5分レンチン\n3.豆乳を入れて全体をよく混ぜる\n4.600W2分レンチン完成。','☆鶏がらスープの素　小さじ2☆醤油　小さじ2☆豆板醤　小さじ1☆にんにく　２センチ☆生姜チューブ　２センチ☆水　100ml☆はるさめ　30-40g☆もやし　お好み☆小松菜　1株ほど☆青梗菜　1株ほど☆豚肉　お好みで☆エビ　お好みで・無調整豆乳　200ml','㉔.png','tori.png ninnniku.png hourennsou.png buta.png ebi.png'),(25,'もうプリン買えない？\nレンチンぷるぷるプリン','1.レンチンOKな容器に☆の材料を入れる\n2.600W3分レンチン\n固まらない場合は追加で10秒ずつレンチン完成。','・全卵　1個・牛乳or豆乳　130g・ハチミツ　大さじ1と半分・バニラエッセンス　お好みで','㉕.png','tamago.png gyuunyuu.png hachimitu.png'),(26,'簡単！\n豚わさポンパスタ','1.レンチンOKな容器にすべての材料を入れる\n2.600W9分レンチンして完成\n3.お好みでポン酢をかけて食べるとさっぱりします。','・パスタ 100g・水 230㎖・オリーブオイル 適量・コンソメ 1個・豚ロース 80g・大葉 3枚・塩昆布 2つまみ・わさびチューブ 3cm程度・ポン酢 大さじ2','㉖.png','pasta.png konnsome.png buta.png konnbu.png'),(27,'レンジでしっとり\nネギ塩チキン','1.レンチンOKな容器に薄切りにした鶏むね肉と\n☆の材料を入れる600W5分レンチン\n2.レンジで5分そのまま放置する\n3.ゴマ油とごまをかけて完成。\n(肉に火が通っていない時は追加で1分レンチンする)','☆鶏むね肉 300g☆長ネギ 1本☆塩 小さじ1☆黒胡椒 適量☆味の素 8振り☆料理酒 大さじ3⚫︎ごま油 大さじ1⚫︎ごま 適量','㉗.png','toriniku.png negi.png'),(28,'レンジで簡単\n豚もやし蒸し','1.レンチンOKな容器に☆の材料を入れる\n2.600W5分レンチン。\n3.お好みで白ごま、ねぎをかけて完成。','☆酒　15ml☆しょうゆ　15ml☆砂糖　5g☆おろしにんにく　２g☆ごま油　10ml☆もやし　200g☆うすぎりの豚肉　200g・白ごま　お好みで・ねぎ　お好みで','㉘.png','ninnniku.png buta.png negi.png'),(29,'火を使わない\n10分ナポリタン','1.レンチンOKな容器に☆の材料を入れる\n2.パスタの湯で時間+2分レンチン。\n3.全卵を割り入れよく混ぜる\n4.お好みで粉チーズ、パセリを振りかけて完成。','☆乾麺パスタ(5分茹で)　80g☆オリーブオイル　小さじ2☆水　200ml☆ウインナー　3本☆パプリカ　30g☆コンソメ　小さじ1☆ケチャップ　大さじ3・全卵　1個・粉チーズ　お好み・パセリ　お好み','㉙.png','pasta.png uinnna-.png konnsome.png tamago.png chi-zu.png'),(30,'菓子パンやめてこれ食べよ！\nレンジで作る米粉ぱん','1.レンチンOKな容器にすべての材料を入れ混ぜる\n2.600W2分レンチン完成。','・卵　1個・純ココア 　大さじ１・はちみつ 　大さじ１・米粉　大さじ３・ベーキングパウダー　小さじ1/2・米油　小さじ１','㉚.png','tamago.png hachimitu.png');
/*!40000 ALTER TABLE `zubora_recipes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `icons`
--

DROP TABLE IF EXISTS `icons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `icons` (
  `id` int(11) NOT NULL,
  `icon_name` varchar(250) NOT NULL,
  `icon_path` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `icons`
--

LOCK TABLES `icons` WRITE;
/*!40000 ALTER TABLE `icons` DISABLE KEYS */;
INSERT INTO `icons` VALUES (1,'バター','bata-.png\r'),(2,'ベーコン','be-kon.png\r'),(3,'ぶた','buta.png\r'),(4,'チーズ','chi-zu.png\r'),(5,'えび','ebi.png\r'),(6,'ごはん','gohan.png\r'),(7,'ぎゅうにゅう','gyuunyuu.png\r'),(8,'はちみつ','hachimitu.png\r'),(9,'ほうれんそう','hourensou.png\r'),(10,'かい','kai.png\r'),(11,'きのこ','kinoko.png\r'),(12,'コンソメ','konnsome.png\r'),(13,'めんたいこ','menntaiko.png\r'),(14,'ねぎ','negi.png\r'),(15,'にんじん','ninnjin.png\r'),(16,'にんにく','ninnniku.png\r'),(17,'パスタ','pasta.png\r'),(18,'さかな','sakana.png\r'),(19,'たまご','tamago.png\r'),(20,'たまねぎ','tamanegi.png\r'),(21,'とまと','tomato.png\r'),(22,'とり','tori.png\r'),(23,'とりにく','toriniku.png\r'),(24,'ツナ缶','tunakan.png\r'),(25,'うどん','udon.png\r'),(26,'ウインナー','uinnna-.png\r'),(27,'うし','ushi.png\r'),(28,'昆布','konnbu.png');
/*!40000 ALTER TABLE `icons` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-02-13 13:45:57
