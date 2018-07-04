set names utf8;
set foreign_key_checks=0;

drop database if exists pixpress;
create database if not exists pixpress DEFAULT CHARACTER SET utf8mb4;

use pixpress;

/*
 * 会員情報テーブル
 */


create table user_info(
	id int primary key not null auto_increment comment "ID",
	user_id varchar(16) unique not null comment "ユーザーID",
	password varchar(16) not null comment "パスワード",
	family_name varchar(32) not null comment "姓",
	first_name varchar(32) not null comment "名",
	family_name_kana varchar(32) not null comment "姓かな",
	first_name_kana varchar(32) not null comment "名かな",
	sex tinyint not null default 0 comment "姓別",
	email varchar(32) not null comment "メールアドレス",
	status tinyint not null default 0 comment "ステータス",
	logined tinyint not null default 0 comment "ログインフラグ",
	m_flg tinyint not null default 0 comment "マスターフラグ",
	regist_date datetime not null comment "登録日",
	update_date datetime not null comment "更新日"
	)
comment="会員情報テーブル"
;
insert into user_info values
(1,"guest","guest","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,0,now(),now()),
(2,"guest2","guest2","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,0,now(),now()),
(3,"guest3","guest3","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,0,now(),now()),
(4,"guest4","guest4","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,0,now(),now()),
(5,"guest5","guest5","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,0,now(),now()),
(6,"guest6","guest6","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,0,now(),now()),
(7,"guest7","guest7","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,0,now(),now()),
(8,"guest8","guest8","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,0,now(),now()),
(9,"guest9","guest9","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,0,now(),now()),
(10,"guest10","guest10","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,0,now(),now()),
(11,"guest11","guest11","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,0,now(),now()),
(12,"guest12","guest12","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,0,now(),now()),


(13,"admin","admin","インターノウス","マスターユーザー","いんたーのうす","ますたーゆーざー",0,"master@gmail.com",0,0,0,now(),now()),
(14,"admin2","admin2","インターノウス","マスターユーザー","いんたーのうす","ますたーゆーざー",0,"master@gmail.com",0,0,0,now(),now()),
(15,"admin3","admin3","インターノウス","マスターユーザー","いんたーのうす","ますたーゆーざー",0,"master@gmail.com",0,0,0,now(),now()),
(16,"admin4","admin4","インターノウス","マスターユーザー","いんたーのうす","ますたーゆーざー",0,"master@gmail.com",0,0,0,now(),now()),
(17,"admin5","admin5","インターノウス","マスターユーザー","いんたーのうす","ますたーゆーざー",0,"master@gmail.com",0,0,0,now(),now()),
(18,"admin6","admin6","インターノウス","マスターユーザー","いんたーのうす","ますたーゆーざー",0,"master@gmail.com",0,0,0,now(),now()),
(19,"admin7","admin7","インターノウス","マスターユーザー","いんたーのうす","ますたーゆーざー",0,"master@gmail.com",0,0,0,now(),now()),
(20,"admin8","admin8","インターノウス","マスターユーザー","いんたーのうす","ますたーゆーざー",0,"master@gmail.com",0,0,0,now(),now()),
(21,"admin9","admin9","インターノウス","マスターユーザー","いんたーのうす","ますたーゆーざー",0,"master@gmail.com",0,0,0,now(),now()),
(22,"admin10","admin10","インターノウス","マスターユーザー","いんたーのうす","ますたーゆーざー",0,"master@gmail.com",0,0,0,now(),now()),
(23,"admin11","admin11","インターノウス","マスターユーザー","いんたーのうす","ますたーゆーざー",0,"master@gmail.com",0,0,0,now(),now()),
(24,"admin12","admin12","インターノウス","マスターユーザー","いんたーのうす","ますたーゆーざー",0,"master@gmail.com",0,0,0,now(),now());

/*
 * 商品情報テーブル
 */

create table product_info(
	id int primary key not null auto_increment comment "ID",
	product_id int unique not null comment "商品ID",
	product_name varchar(100) unique not null comment "商品名",
	product_name_kana varchar(100) unique not null comment "商品名かな",
	category_id int not null comment "カテゴリID",
	price int not null comment "価格",
	cast_name1 varchar(50) not null comment "出演者1",
	cast_name2 varchar(50) not null comment "出演者2",
	cast_name3 varchar(50) not null comment "出演者3",
	director varchar(50) not null comment "監督",
	release_year int not null comment "公開年",
	product_description varchar(511) comment "商品詳細",
	image_file_path varchar(100) comment "画像ファイルパス",
	image_file_name varchar(50) comment "画像ファイル名",
	status int not null default 0 comment "ステータス",
	regist_date datetime not null comment "登録日",
	update_date datetime comment "更新日",

foreign key(category_id) references m_category(category_id)
)
comment="商品情報テーブル"
;

insert into product_info(product_id,product_name,product_name_kana,category_id,price,cast_name1,cast_name2,cast_name3,director,release_year,product_description,image_file_path,image_file_name,status,regist_date,update_date) values

( 1, "Mission: Impossible", "みっしょんいんぽっしぶる", 2, 850, "Tom Cruise", "Jon Voight", "Emmanuelle Beart", "Brian De Palma", 1996, "東欧で展開されたスパイ組織IMFの作戦は失敗に終わる。多くの仲間を失い、裏切り者として追われることとなったイーサンは真実を暴くため、CIA本部への潜入を試みる...。", "./images/action01.jpg", "シリーズ1", 0, now(), now()),
( 2, "Mission: Impossible II", "みっしょんいんぽっしぶる2", 2, 850, "Tom Cruise", "Dougray Scott", "Thandie Newton", "John Woo", 2000, "新種のウイルス・キメラとその治療薬が、IMFメンバーのショーン・アンブローズによって強奪されてしまう。IMF本部は、イーサン・ハントを中心にチームを組み、その目的を探ることとなるが...。", "./images/action02.jpg", "シリーズ2", 0, now(), now()),
( 3, "Mission: Impossible III", "みっしょんいんぽっしぶる3",2,850,"Tom Cruise","Michelle Monaghan","Ving Rhames", "J.J. Abrams",2006,"現役を退きIMFの教官となっていたイーサンは、ミッション中に行方不明となった教え子を救出するため現役として復帰する。再び危険なミッションに挑むイーサンの前に、婚約者ジュリアをも巻き込む巨大な陰謀が立ちはだかる...。","./images/action03.jpg","シリーズ3",0,now(),now()),
( 4, "Deadpool","でっどぷーる", 2,850,"Ryan Reynolds"," Morena Baccarin","Ed Skrein", "Tim Miller",2016,"ヒーリング・ファクターの実験により醜い姿になってしまったウェイド。狂気に満ちた彼は傭兵デッドプールと名乗り、自身を実験台にして人生を滅茶苦茶にした研究者たちに復讐を果たすことを決意する。","./images/action04.jpg","デッドプール",0,now(),now()),
( 5, "Inception","いんせぷしょん", 2,850,"Leonardo DiCaprio","Joseph Gordon-Levitt","Ellen Page", "Christopher Nolan",2010,"人が眠っている間に潜在意識に侵入し、他人のアイデアを盗みだすという犯罪分野のスペシャリストのコブは、その才能ゆえに最愛の者を失い、国際指名手配犯となってしまう。そんな彼に、人生を取り戻す唯一のチャンス「インセプション」という最高難度のミッションが与えられる。","./images/action05.jpg","インセプション",0,now(),now()),
( 6, "Wanted","うぉんてっど", 2,850,"Angelina Jolie","James McAvoy","Morgan Freeman", "Timur Bekmambetov",2008,"仕事もプライベートも冴えない青年ウェスリーの前にある日、謎の美女フォックスが現われる。彼が秘密組織“フラタニティ”の王位継承者だというフォックス。彼を暗殺者として覚醒させるため、過激な訓練が始まるが…。","./images/action06.jpg","レオン",0,now(),now()),
( 7, "Kill Bill","きるびる", 2,850,"Uma Thurman","David Carradine","Daryl Hannah", "Quentin Tarantino",2003,"かつて世界中を震撼させた暗殺集団のエージェント“ザ・ブライド”。彼女は自分の結婚式の真っ只中に、かつてのボス“ビル”の襲撃に遭い、夫とお腹の子どもを殺される。それから5年、復讐の鬼と化したザ・ブライドは、たったひとりで闘いの旅へと向かうのだった…。","./images/action07.jpg","キルビル",0,now(),now()),
( 8, "Sherlock Holmes","しゃーろっくほーむず", 2,850,"Robert Downey Jr","Jude Law","Rachel McAdams", "Guy Ritchie",2009,"19世紀末のロンドン。ホームズとワトソンの2人は、怪しい黒魔術の儀式を行い、若い女性を次々と殺害するブラックウッド卿を逮捕する。だが、処刑されたはずのブラックウッドが蘇り、再び殺人事件が発生する……。","./images/action08.jpg","シリーズ1",0,now(),now()),
( 9, "Sherlock Holmes: A Game of Shadows","しゃーろっくほーむず しゃどうげーむ", 2,850,"Robert Downey Jr","Jude Law","Rachel McAdams", "Guy Ritchie",2011,"連続爆破事件が発生し、ホームズは天才数学者のモリアーティ教授こそが黒幕だと推理する。事件に関与していると見たアイリーンが姿を消し、「手を引かなければワトソンの命も狙う」と脅迫されたホームズは、事件解決の鍵となる女性シムを探しにフランスへ向かうが……。","./images/action09.jpg","シリーズ2",0,now(),now()),
( 10, "The Dark Knight","だーくないと", 2,850,"Christian Bale","Heath Ledger","Aaron Eckhart", "Christopher Nolan",2008,"クリストファー・ノーラン監督＆クリスチャン・ベール主演による「バットマン・ビギンズ」の続編。ゴッサム・シティに現れた史上最悪の犯罪者ジョーカー。バットマン＝ブルース・ウェインは、協力するゴードン警部補や新任地方検事ハービー・デントらと共にジョーカーに立ち向かうが……。ジョーカー役のヒース・レジャーは撮影直後に急逝するも、その演技が絶賛され、第81回アカデミー賞で助演男優賞を受賞した。","./images/action10.jpg","シリーズ2",0,now(),now()),



( 11, "Home Alone","ほーむあろーん", 3,850,"Macaulay Culkin","Joe Pesci","Daniel Stern", "Chris Columbus",1990,"驚異の世界的大ヒットを放った、スーパー・コメディ第1弾！家に取り残されたケビンは、一人の自由を思う存分楽しんでいたが、そこに2人組の泥棒が現れて……？","./images/comedy01.jpg","シリーズ1",0,now(),now()),
( 12, "The Mask","ますく", 3,850," Jim Carrey","Cameron Diaz","Peter Riegert", " Chuck Russell",1994,"小心者のスタンリーはひょんなことから不思議なマスクを拾う。家に帰り何気なくそのマスクを着けたとたん！猛烈な竜巻と共に彼の中のもうー人の自分《マスク》が現れた。そして彼は《マスク》の力を借りて、ー目惚れしたクラブ歌手、ティナにアタックするのだが……。","./images/comedy02.jpg","シリーズ1",0,now(),now()),
( 13, "Doctor Dolittle","どくたーどりとる", 3,850,"Eddie Murphy","Peter Boyle","Ossie Davis", "Betty Thomas",1998,"子供時代のドリトル先生は動物と話ができるフシギな能力を持っていたが、結局誰にも信じてもらえず、いつしか動物に対して心を閉ざしてしまっていた。ところが30年後のある日、ひょんなことからその能力が復活?! 噂を聞きつけた悩める動物たちがどんどん押し寄せてきて大パニックに! ","./images/comedy03.jpg","シリーズ1",0,now(),now()),
( 14, "Mr. Bean","みすたーびーん", 3,850,"Rowan Atkinson","Willem Dafoe","Steve Pemberton", "Steve Bendelack",2007,"人気TVコメディ『Mr.ビーン』の劇場版第2弾。教会のくじでカンヌ旅行が当たったビーン。カンヌで世界最大の映画祭が開催中だと知り、偶然知り合った映画監督の息子・ステパン少年とカンヌ行きを決行するが…。","./images/comedy04.jpg","シリーズ1",0,now(),now()),
( 15, "Wedding Crashers","うぇでぃんぐくらっしゃーず", 3,850,"Owen Wilson"," Vince Vaughn","Rachel McAdams", "David Dobkin",2005,"オーウェン・ウィルソン、ヴィンス・ボーン共演の痛快ラブコメディ。他人の結婚式で女性をナンパする“結婚荒らし”のジョンとジェレミーは、大物政治家の結婚式に潜り込み…。","./images/comedy05.jpg","シリーズ1",0,now(),now()),
( 16, "The Hangover","はんぐおーばー", 3,850," Zach Galifianakis"," Bradley Cooper"," Justin Bartha", "Todd Phillips",2009,"結婚式を2日後に控え、新郎のダグは独身最後の夜を満喫すべく、友人たちとラスベガスの高級ホテルのスイートで散々バカ騒ぎをして楽しんだ。しかし翌朝二日酔いから目覚めると、部屋は荒れ新郎の姿は消えていた。一体彼らに何が起きたのか!?","./images/comedy06.jpg","シリーズ1",0,now(),now()),
( 17, "Kick-Ass","きっくあす", 3,850,"Aaron Taylor-Johnson"," Nicolas Cage"," Chloe Grace Moretz", "Matthew Vaughn",2010,"とあるコミックオタクの平凡な高校生が、自ら“キック・アス”と名乗り、ヒーローとして活躍する姿を描くアクション・ムービー。クロエ・モレッツが美少女ヒーローを熱演。実際にアメコミマニアのニコラス・ケイジふんする“ビッグ・ダディ”の名演も見逃せない。","./images/comedy07.jpg","シリーズ1",0,now(),now()),
( 18, "Jumanji: Welcome to the Jungle","じゅまんじ うぇるかむとぅじゃんぐる", 3,850,"Dwayne Johnson"," Karen Gillan","Kevin Hart", "Jake Kasdan",2017,"高校の地下室で居残りを命じられた4人の少年少女は、そこでジュマンジという古いビデオゲームを見つける。プレイしようとキャラクターをチョイスした瞬間、彼らは選んだ人物に変身し、ゲーム内の世界であるジャングルへと移動してしまう。現実とは全く違うキャラクターになった彼らは、カバ、ジャガー、ゾウ、サイの群れなど、次から次へ野生動物と遭遇。危険にさらされながら、何とかゲームをクリアして現実世界に戻ろうとするが……。","./images/comedy08.jpg","シリーズ1",0,now(),now()),
( 19, "Men in Black","めんいんぶらっく", 3,850," Tommy Lee Jones"," Will Smith"," Linda Fiorentino", "Barry Sonnenfeld",1997,"協定に基づき地球に侵入して来た異星人の監視を行う秘密組織MIB（メン・イン・ブラック）エージェントの活躍を描いたコメディ・タッチのSFアクション映画。NY市警の警官ジェームズは逃走中の犯人が人間でない事を知るが、その記憶は警察署に現れた黒服の男“K”によって消されてしまう。“K”はMIBと呼ばれるエイリアン監視組織の一員だった。ジェームズの腕を認めた“K”は彼を組織にスカウトし、二人は地球に無断で侵入して来た昆虫型エイリアンの追跡を開始する。","./images/comedy09.jpg","シリーズ1",0,now(),now()),



( 20, "Prison Break","ぷりずんぶれいく", 4,850,"Dominic Purcell","Wentworth Miller","Amaury Nolasco", "Bobby Roth",2005,"マイケル･スコフィールドはボストンに住む優秀な建築技師であったが、兄リンカーン･バロウズが副大統領実弟殺人の罪で死刑を言い渡されたことにより人生が180度変わる。","./images/dorama01.jpg","シリーズ1",0,now(),now()),
( 21, "Prison Break3","ぷりずんぶれいく3", 4,850,"Dominic Purcell","Wentworth Miller","Amaury Nolasco", "Bobby Roth",2005,"自由の身となったリンカーン・バローズ（ドミニク・パーセル）は、アメリカ領事にマイケルの無罪を主張し、マイケルが他の刑務所へ移送される約束を取りつけます。その頃、SONA刑務所では、刑務所のボスであるノーマン・セント・ジョン – 通称ルチェロ（ロバート・ウィスダム）が有名人マイケルに目を付ける…。","./images/dorama02.jpg","シリーズ1",0,now(),now()),
( 22, "CSI: Miami season7","CSI まいあみ しーずん7", 4,850," David Caruso","Emily Procter","Adam Rodriguez", "Larry Detwiler",2009,"飛行場でホレイショが銃撃された。知らせを受けて駆け付けたカリーとデルコは取り調べを抜けていたウルフがすでに現場に到着し２人が来る前に「マスコミに血だらけのチーフを見せたくない」と死体を搬送させたことを知る。","./images/dorama03.jpg","シリーズ1",0,now(),now()),
( 23, "CSI: Miami season10","CSI まいあみ しーずん10", 4,850," David Caruso","Emily Procter","Adam Rodriguez", "Larry Detwiler",2012,"海も空も美しく、セレブの別荘が立ち並ぶマイアミ。中南米に最も近い米国のこの都市は、麻薬などの密輸の中継地になることが多く、移民の率も高い、全米屈指の犯罪多発地帯だ。マイアミ＝デイド郡にある警察のＣＳＩ（科学捜査班）は、悪を絶対に許さないチーフ、ホレイショの下、凶悪犯罪に立ち向かい続ける。","./images/dorama04.jpg","シリーズ1",0,now(),now()),
( 24, "BONES season6","ぼーんず しーずん6", 4,850,"Emily Deschanel","David Boreanaz","Michaela Conlin", "Hart Hanson",2009,"ブレナン（エミリー・デシャネル）とブース（デヴィッド・ボレアナズ）は、それぞれ自分の仕事に励んでいた。ブレナンはマルク諸島で発掘作業の最中、ギャングに襲われるが、逆に倒してしまう。ブースはアフガニスタンへ。そんな2人に、戻ってきて欲しいと電話が入る。カミールが危機的状況に陥っていたのだ。","./images/dorama05.jpg","シリーズ1",0,now(),now()),
( 25, "BONES season10","ぼーんず しーずん10", 4,850,"Emily Deschanel","David Boreanaz","Michaela Conlin", "Hart Hanson",2015,"ウェインはデイルに対して「パパの公園へようこそ」と語る。もしかして離婚組なのか。ママたちは子供を古い遊具で遊ばせたがらないので、ここには子連れの父親ばかりが集まるのだという。そんな中、公園の遊具が動かなくなっていた。力尽くでデイルとウェインで回すと下に人間の遺体が入って引っかかっており、回った途端に生首が飛んでくる。","./images/dorama06.jpg","シリーズ1",0,now(),now()),
( 26, "Breaking Bad","ぶれいきんぐばっど", 4,850,"Bryan Cranston","Aaron Paul","Anna Gunn", "Michelle MacLaren",2008,"主人公のウォルターは冴えない高校の化学教師だが、自身が末期がんに冒されていることを知った後、新しい人生に目覚める。かつては成功を嘱望される化学者だったウォルターだが、今はやる気のない高校生に授業を行うかたわら、洗車のアルバイトをして家計を助ける身。妻のスカイラーは、eBayでの売買でほどほどの稼ぎを得ていた。息子のウォルター・ジュニアは17才。意志の強い若者だったが、脳性まひに苦しんでいた。家族に残せるものがほとんどないことに気がついたウォルターは、新しい人生の目的に目覚め、愛する家族に財産を残すため犯罪に手を染めていく。","./images/dorama07.jpg","シリーズ1",0,now(),now()),



( 27, "魔法にかけられて","まほうにかけられて", 5,850," Amy Adams","Susan Sarandon","James Marsden", "Kevin Lima",2007,"大都会の冷たい人たちに戸惑うジゼルを助けたのは、現実主義でバツイチの弁護士ロバート。動物と話し、ところ構わず歌いだすジゼルに驚き、時にうとましく思うロバートは、彼女と過ごすうちにその素直で心優しい姿に惹かれていく ―。しかし彼女を追って現代にやってきたエドワード王子やその家来、更にジゼルを罠に陥れたナリッサ女王の登場で、ニューヨークの街は大パニックに！！","./images/fantasy01.jpg","シリーズ1",0,now(),now()),
( 28, "美女と野獣","びじょとやじゅう", 5,850," Emma Watson","Dan Stevens","Luke Evans", " Bill Condon",2017,"バラを盗み、命を差し出せと言われた父の身代わりに、野獣の城に囚われた美しい娘ベル。やがてベルは、野獣の恐ろしい姿の下にある、もう一つの姿に気付き始める。かつてその城で何があったのか、野獣が犯した罪とは?いま、真実の愛が、隠された秘密を解き明かしていく─。","./images/fantasy02.jpg","シリーズ1",0,now(),now()),
( 29, "Pan's Labyrinth","ぱんずらびりんす", 5,850," Ivana Baquero","Ariadna Gil"," Sergi López", "Guillermo del Toro",2006,"再婚した母に連れられ、山中でレジスタンス掃討の指揮をとる冷酷な義父のもとへとやって来た空想好きの少女は、やがて残酷な現実世界から逃避し森の中の不思議な迷宮へと迷い込んでいくが…。イマジネーションあふれるヴィジュアルと深いテーマ性が高く評価され、アカデミー賞3部門受賞をはじめ、数々の映画賞を席巻した話題作。","./images/fantasy03.jpg","シリーズ1",0,now(),now()),
( 30, "Alice in Wonderland","ありすいんわんだーらんど", 5,850,"Mia Wasikowska"," Johnny Depp"," Helena Bonham Carter", "Tim Burton",2010,"19歳のアリスは、うさぎの穴からアンダーランドと呼ばれる不思議の国へ迷い込む。この世界の奇妙な住人たちは、なぜか皆アリスを知っていた。残忍な赤の女王の支配に苦しむ彼らの最後の希望を託されたアリスは、ワンダーランドの運命を賭けた戦いに巻き込まれていく―","./images/fantasy04.jpg","シリーズ1",0,now(),now()),
( 31, "Fantastic Beasts","ふぁんたすてぃっくびーすと", 5,850,"Eddie Redmayne"," Katherine Waterston"," Alison Sudol", " David Yates",2016,"1926年、勇敢だが少し不器用な魔法動物学者のニュート・スキャマンダーがニューヨークを訪れる。そして魔法の世界を危険にさらす、邪悪な策謀に対抗する。","./images/fantasy05.jpg","シリーズ1",0,now(),now()),
( 32, "Big Fish","びっぐふぃっしゅ", 5,850," Ewan McGregor","Albert Finney","Billy Crudup", "Tim Burton",2003,"エドワードは彼が語るお伽話で有名になった人物。未来を予見する魔女のこと、一緒に旅をした巨人のこと、人を襲う森とその先にある美しい町のこと。彼が語る「人生のストーリー」に誰もが楽しく、幸せな気分になった。しかし、一人息子のウィルはそんな父の話が嫌いだった。長い間すれ違う父と子。そんなある日患っていたエドワードの容態が悪化し、実家に戻ったウィルに、残された時間があとわずかだと告げられる。","./images/fantasy06.jpg","シリーズ1",0,now(),now()),
( 33, "チャーリーとチョコレート工場","ちゃーりーとちょこれーとこうじょう", 5,850," Johnny Depp"," Freddie Highmore","David Kelly", " Tim Burton",2005,"美味しいお菓子で世界中の人々を魅了するウィリー・ウォンカが、選ばれた5人の子どもたちを秘密の工場にご招待。幸運な5人が目にした夢のような世界とは…?","./images/fantasy07.jpg","シリーズ1",0,now(),now()),



( 34, "The Shining","しゃいにんぐ", 6,850,"Jack Nicholson","Shelley Duvall"," Danny Lloyd", "Stanley Kubrick",1980,"冬の間閉鎖されるホテルに、作家志望のジャック一家が管理人としてやってきた。そのホテルでは過去に、管理人が家族を惨殺するという事件が起こっていたのだが……。モダン・ホラーの帝王S・キングの同名原作を離れ、キューブリックが独自に造り上げたホラー。","./images/hora01.jpg","シリーズ1",0,now(),now()),
( 35, "The Exorcist","えくそしすと", 6,850,"Ellen Burstyn","Max von Sydow","Linda Blair", " William Friedkin",1973,"12才の少女リーガンに取り付いた悪魔パズズと二人の神父の戦いを描いたウィリアム・ピーター・ブラッティ（オスカーを受賞した脚色も担当）の同名小説を映画化したセンセーショナルな恐怖大作で一大オカルト・ブームを巻き起こした。","./images/hora02.jpg","シリーズ1",0,now(),now()),
( 36, "Friday the 13th","13にちのきんようび ふらいでー", 6,850,"Betsy Palmer","Adrienne King"," Jeannine Taylor", " Sean S. Cunningham",1980,"1957年の13日の金曜日。ニュージャージー州ブレアーズタウンのクリスタルレイク付近のキャンプ場にて、一人の少年が溺れて消息不明になった。それから数年の間、クリスタルレイクのキャンプ場にて奇怪な事件が多発し、遂にはキャンプ指導員の男女二人が何者かに殺害された事件が発生。","./images/hora03.jpg","シリーズ1",0,now(),now()),
( 37, "The Gingerdead Man","じんじゃーでっどまん", 6,850,"Gary Busey","Robin Sydney","Ryan Locke", "Charles Band",2005,"チャイルドプレイのチャッキー、パペットマスターに続くホラーヒーローのニューアイコン「ジンジャーデッドマン」の誕生! !見た目は可愛いキャラだが人間を襲うスラッシャー作品。本作はアメリカでは定番のお菓子ジンジャークッキーが人間に襲い掛かる! !","./images/hora04.jpg","シリーズ1",0,now(),now()),
( 38, "[Rec]","れっく", 6,850," Manuela Velasco","Ferran Terraza","Jorge-Yamam Serrano ", "Jaume Balaguero",1980,"レポーターのアンヘラ（マニュエラ・ヴェラスコ）は、あるアパートに出動する消防団に同行取材を行う。現場にいたのは血まみれの老婆。老婆は警官にかみ付き、建物は外から封鎖されてしまう。救出に来た衛生士の口から、この建物で発生したと思われる人や動物を凶暴にする病原菌の存在を知らされ……。","./images/hora05.jpg","シリーズ1",0,now(),now()),
( 39, "Cult of Chucky","ちゃいるどぷれい", 6,850," Allison Dawn Doiron"," Alex Vincent","Brad Dourif", "Don Mancini",1980,"ピッツバーグに住む美容師フランキーは、南米を旅した母からお土産のロザリオを贈られた。それから数日後、バスタブでくつろぐ彼女の肉体に激痛が走った。両手首には太い杭が貫通したような穴が開き、鮮血がほとばしる。それは<スティグマータ>の始まりであった…。","./images/hora06.jpg","シリーズ1",0,now(),now()),



( 40, "Back to the Future","ばっくとぅざふゅーちゃー", 7,850,"Michael J. Fox"," Christopher Lloyd","Lea Thompson", "Robert Zemeckis",1985,"カデミー賞受賞製作者のスティーヴン・スピルバーグとロバート・ゼメキスがお届けする「バック・トゥ・ザ・フューチャー」は３部作の映画として大成功した作品の一つ。革新的な特殊効果とドラマチックな音楽、そしてアクションが満載のこの作品は、永遠の青春アクション傑作だ","./images/sf01.jpg","シリーズ1",0,now(),now()),
( 41, "Back to the Future II","ばっくとぅざふゅーちゃー2", 7,850,"Michael J. Fox"," Christopher Lloyd","Lea Thompson", "Robert Zemeckis",1989,"マーティが過去・現在・未来を駆けめぐる人気SFシリーズ第2弾。空飛ぶ車やスケボーなどの楽しい近未来アイテムや、一人4役をこなすマイケル・J・フォックスの芸達者ぶりなど、見どころ満載!! ","./images/sf02.jpg","シリーズ1",0,now(),now()),
( 42, "Ghost Busters","ごーすとばすたーず", 7,850,"Bill Murray","Dan Aykroyd","Sigourney Weaver", "Ivan Reitman",1985,"コロンビア大学の物理学博士エリン・ギルバート(クリステン・ウィグ)は大学の終身雇用の審査を控え、日夜研究を重ねていた。しかし、なりゆきでアビー(メリッサ・マッカーシー)と共にゴースト調査を行ったことで、大学を一方的に解雇されてしまう。2人はその知識と技術を活かすため、幽霊退治を行う会社「ゴーストバスターズ」を起業するが―。","./images/sf03.jpg","シリーズ1",0,now(),now()),
( 43, "Ghost Busters II","ごーすとばすたーず2", 7,850,"Bill Murray","Dan Aykroyd"," Sigourney Weaver", "Ivan Reitman",1985,"魔人ゴーザの魔の手から世界を救ったゴーストバスターズ。しかしビルを破壊したためニューヨーク市から訴えられ解散してしまった。ピーターと別れたディナは一人で息子のオスカーを育てていた。そのオスカー坊やが霊界の大王、ビーゴ復活の生贄として狙われていることを知る。かくしてゴーストたちと対決すべく再びゴーストバスターズが結成された! ","./images/sf04.jpg","シリーズ1",0,now(),now()),
( 44, "The Terminator","たーみねーたー", 7,850,"Arnold Schwarzenegger","Linda Hamilton","Michael Biehn", "James Cameron",1984,"未来の革命リーダーを抹殺せんがため、近未来の地球から送り込まれた殺人サイボーグ、ターミネーター! ターミネーターからサラを守るため、一人の革命戦士・リースが未来からやってきた。ガンを片手に次々と殺害を繰り返し、不死身の体で追ってくるターミネーターを相手に、サラとリースは死闘を展開するが──!","./images/sf05.jpg","シリーズ1",0,now(),now()),
( 45, "Interstellar","いんたーすてらー", 7,850," Matthew McConaughey"," Anne Hathaway","Matt Damon", "Christopher Nolan",2014,"地球の寿命は尽きかけていた。居住可能な新たな惑星を探すという人類の限界を超えたミッションに選ばれたのは、まだ幼い子供を持つ元エンジニアの男。彼を待っていたのは、未だかつて誰も見たことがない、衝撃の宇宙。はたして彼は人類の存続をかけたミッションを成し遂げることが出来るのか？","./images/sf06.jpg","シリーズ1",0,now(),now()),
( 46, "オデッセイ","おでっせい", 7,850," Matt Damon","Jessica Chastain"," Kristen Wiig", " Ridley Scott",2015,"火星での有人探査中に嵐に巻き込まれた宇宙飛行士のマーク・ワトニー（マット・デイモン）。乗組員はワトニーが死亡したと思い、火星を去るが、彼は生きていた。空気も水も通信手段もなく、わずかな食料しかない危機的状況で、ワトニーは生き延びようとする。一方、NASAは世界中から科学者を結集し救出を企て、仲間たちもまた大胆な救出ミッションを敢行しようとしていた。","./images/sf07.jpg","シリーズ1",0,now(),now()),
( 47, "Edge of Tomorrow","えっじおぶとぅもろー", 7,850,"Tom Cruise","Emily Blunt"," Bill Paxton", "Doug Liman",2014,"近未来の地球。侵略者の激しい攻撃に、人類の軍事力ではもはや太刀打ちできなくなっていた。対侵略者の任務に就いたウィリアム・ケイジ少佐（トム・クルーズ）は、戦闘によって亡くなる。しかし、タイムループの世界にとらわれ、戦闘と死を繰り返す。そんな中、特殊部隊の軍人リタ・ヴラタスキ（エミリー・ブラント）と出会ったケイジは、彼女と一緒に何度も戦闘と死を繰り返しながら戦闘技術を向上させ……。","./images/sf08.jpg","シリーズ1",0,now(),now()),
( 48, "Mad Max: Fury Road","まっどまっくす いかりのですろーど", 7,850,"Tom Hardy"," Charlize Theron","Nicholas Hoult", "George Miller",2015,"石油も、そして水も尽きかけた世界。主人公は、愛する家族を奪われ、本能だけで生きながらえている元・警官マックス。資源を独占し、恐怖と暴力で民衆を支配するジョーの軍団に捕われたマックスは、反逆を企てるジョーの右腕フュリオサ、配下の全身白塗りの男ニュークスと共に、ジョーに捕われた美女たちを引き連れ、自由への逃走を開始する。","./images/sf09.jpg","シリーズ1",0,now(),now()),



( 49, "Good Will Hunting","ぐっどうぃるはんてぃんぐ",8,850,"Matt Damon","Robin Williams","Ben Affleck","Gus Van Sant",1997,"アカデミー賞®の９部門でノミネートされ、映画業界に本物の衝撃を与えたサクセス・ストーリー。ロビン・ウィリアムズ（助演男優賞）、そしてホットな新人のマット・デイモンとベン・アフレック（脚本賞）が見事、オスカーを受け取った。全米トップの大学で最も才気のある若者は学生ではなく、床清掃員の青年だった！天才であるにも関わらず、失敗続きの人生を送ってきた強情な労働者階級のウィル・ハンティング（マット・デイモン）。何度も法に触れることをしてきたウィルは、最後のチャンスである１人の心理学者（ロビン・ウィリアムズ）と出会う。彼ならば、ウィルの心を動かすことができるのか。","./images/staff01.jpg","グッドウィル",0,now(),now()),
( 50, "Stand By Me","すたんどばいみー", 8,850,"Will Wheaton","River Phoenix","Corey Feldman","Rob Reiner",1986,"1959年オレゴンの小さな町。文学少年ゴーディをはじめとする１２才の仲良し４人組は、行方不明になった少年が列車に轢かれて野ざらしになっているという情報を手にする。死体を発見すれば一躍ヒーローになれる！４人は不安と興奮を胸に未知への旅に出る。たった２日間のこの冒険が、少年たちの心に忘れえぬ思い出を残した・・・・・・。","./images/staff02.jpg","すたばい",0,now(),now()),
( 51, "(500) Days of Summer","500にちのさまー", 8,850,"Zooey Deschanel","Joseph Gordon-Levitt","Geoffrey Arend"," Marc Webb",2009,"運命の恋を夢見る男の子と、真実の愛なんて信じない女の子の、ビタースウィートな500日ストーリー サマーに恋をした、最低で最高の500日。 建築家を夢見つつ、グリーティングカード会社で働くトムは、秘書として入社したサマーに一目惚れしてしまう。意気投合し、いいムードになった二人。トムがサマーに「彼氏はいるの？」と聞くと、サマーの答えはノー。恋愛と友情の間に果てしなく広がるグレーゾーン。人を好きになるって、どうしてこんなに楽しくて切ないんだろう。","./images/staff03.jpg","すたばい",0,now(),now()),
( 52, "Coach Carter","こーちかーたー", 8,850," Samuel L. Jackson","Rick Gonzalez"," Robert Richard","Thomas Carter",2005,"将来に希望が持てない荒んだ環境の中、不振を極めるリッチモンド高校のバスケットボール・チーム。コーチに招かれたカーターは強い信念を胸に、学生としての規律を守ることを若者たちに徹底させる。熱血指導と厳しいトレーニングで生まれ変わったチームは連勝街道を進む。しかし、規律を守れない部員たちに対して、カーターはコートを閉鎖するという非常手段に打って出る・・・。1999年に実際に起こり、全米に波紋を投げかけた感動の実話を映画化。","./images/staff04.jpg","すたばい",0,now(),now()),
( 53, "Forrest Gump","ふぉれすとがんぷ", 8,850," Tom Hanks","Robin Wright"," Gary Sinise"," Robert Zemeckis",1994,"“人生は食べてみなければわからない、チョコレートの箱と同じ”―――アメリカの激動する歴史を駆け抜けた、トム・ハンクス演じる青年フォレストの青春を暖かい感動で描いて、アカデミー賞(R)作品賞ほか6部門を独占した映画史に残る名作。","./images/staff05.jpg","すたばい",0,now(),now()),
( 54, "Leon","れおん", 8,850," Jean Reno","Gary Oldman","Natalie Portman", " Luc Besson",1994,"家族を惨殺された12歳の少女マチルダは、隣の部屋に住む殺し屋レオンに助けを求める。戸惑いながらもマチルダに救いの手を差し出すレオン。そこから二人の奇妙な共同生活が始まった。弟の仇を討ちたいというマチルダにしかたなく殺しのテクニックを教えるレオンと、読み書きもできないレオンに文字を教えるマチルダ。やがて二人の間には父娘とも恋人ともつかない愛情が芽生えていくが…。","./images/staff06.jpg","レオン",0,now(),now()),
( 55, "The Green Mile","ぐりーんまいる", 8,850,"Tom Hanks"," Michael Clarke Duncan","David Morse", "Frank Darabont",1999,"「ショーシャンクの空に」のフランク・ダラボン監督＆スティーブン・キング脚本コンビが放つ感動作。アメリカ南部の死刑囚舎房を舞台に、不思議な力を持つ死刑囚と看守たちとの心の交流を描く。トム・ハンクス主演。1935年、死刑囚舎房で看守を務めていたポールのもとに、ある死刑囚が送られてくる。彼との交流を深めていった看守たちは、やがて彼の罪を疑問視するようになるが・・・。","./images/staff07.jpg","レオン",0,now(),now()),
( 56, "The Sixth Sense","しっくすせんす", 8,850," Bruce Willis"," Haley Joel Osment","Toni Collette", "M. Night Shyamalan",1999,"高名な精神科医のマルコムは、かつて担当していた患者からの凶弾に倒れてしまう。リハビリを果たした彼は、複雑な症状を抱えた少年･コールの治療に取り掛かる事に。コールは常人には無い特殊な第6感、死者を見る事ができる能力を持っていた｡コールを治療しながら、彼によって自らの心も癒されていくマルコム。そして彼には予想も付かない真実が待ち受けていた･･･｡」","./images/staff08.jpg","レオン",0,now(),now()),
( 57, "Catch Me If You Can","きゃっちみーいふゆーきゃん", 8,850,"Leonardo DiCaprio"," Tom Hanks","Christopher Walken", "Steven Spielberg",2002,"1960年代のアメリカ。両親の離婚にショックを受けた16歳のフランク・アバグネイルJr．は、単身ニューヨークへ。やがて、お金に困って“小切手詐欺”を思い付く。その天才的な頭脳とチャーミングな魅力で、巧みにパイロットになりすました彼は、偽造小切手を切っては全米各地を豪遊。ところが、FBIの敏腕捜査官カール・ハンラティが犯人逮捕に乗り出し、世界を股にかけた二人の長い“追いかけっこ”が始まった！","./images/staff09.jpg","レオン",0,now(),now()),
( 58, "The Departed","でぱーてっど", 8,850,"Leonardo DiCaprio"," Matt Damon","Jack Nicholson", "Martin Scorsese",2006,"マフィアに潜入した警察の男vs警察に潜入したマフィアの男。ギャング映画の巨匠マーティン・スコセッシ監督が放つ 超一級クライム・サスペンス！","./images/staff10.jpg","レオン",0,now(),now()),
( 59, "Les Miserables","れ・みぜらぶる", 8,850,"Hugh Jackman","Russell Crowe"," Anne Hathaway", "Tom Hooper",2012,"19世紀のフランスを舞台にした本作は、果たせぬ夢、報われぬ恋、情熱、犠牲、そして贖罪という、心奪われる物語を描き出す。これは、時代を超えて生き続ける人間の魂の証しなのだ。ジャックマン演じる元囚人ジャン・バルジャンは、仮出獄後に逃亡し、それ以来何十年もの間、無慈悲な警部ジャベール（クロウ）の執拗な追跡を受けていた。そんな折、バルジャンは工場労働者ファンテーヌ（ハサウェイ）の幼い娘コゼットの面倒を見ることを約束する。だが、その約束が彼らの人生を永遠に変えてしまうのだった。","./images/staff11.jpg","レオン",0,now(),now()),
( 60, "The Imitation Game","いみてーしょんげーむ", 8,850,"Benedict Cumberbatch"," Keira Knightley"," Matthew Goode", " Morten Tyldum",2014,"第二次世界大戦時、ドイツ軍が誇った世界最強の暗号＜エニグマ＞。 世界の運命は、解読不可能と言われた暗号に挑んだ、一人の天才数学者アラン・チューリングに託された。 英国政府が50年以上隠し続けた、一人の天才の真実の物語。時代に翻弄された男の秘密と数奇な人生とは―","./images/staff12.jpg","レオン",0,now(),now());

/*
 * カート情報テーブル
 */

create table cart_info(
	id int primary key not null auto_increment comment "ID",
	user_id varchar(16) not null REFERENCES user_info(user_id),
	temp_user_id varchar(16) comment "仮ユーザーID",
	product_id int not null REFERENCES product_info(product_id),
	product_count int not null comment "個数",
	price int not null comment "金額",
	regist_date datetime not null comment "登録日",
	update_date datetime comment "更新日"
)
comment="カート情報テーブル"
;

/*
 * 購入履歴情報テーブル
 */

create table purchase_history_info(
	id int primary key not null auto_increment comment "ID",
	user_id varchar(16) not null comment "ユーザーID",
	product_id int not null comment "商品ID",
	product_count int not null comment "個数",
	price int not null comment "合計金額",
	destination_id int not null comment "宛先情報ID",
	regist_date datetime not null comment "登録日",
	update_date datetime not null comment "更新日",
	delivery_date varchar(50) not null comment "配達日時",
	delivery_time varchar(50) not null comment "配達時間",

foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id)
)
comment="購入履歴情報テーブル"
;

/*
 * 宛先情報テーブル
 */

create table destination_info(
	id int primary key not null auto_increment comment "ID",
	user_id varchar(16) not null comment "ユーザーID",
	family_name varchar(32) not null comment "姓",
	first_name varchar(32) not null comment "名",
	family_name_kana varchar(32) not null comment "姓かな",
	first_name_kana varchar(32) not null comment "名かな",
	email varchar(32) not null comment "メールアドレス",
	tel_number varchar(13) not null comment "電話番号",
	user_address varchar(50) not null comment "住所",
	regist_date datetime not null comment "登録日",
	update_date datetime not null comment "更新日"
)
comment="宛先情報テーブル"
;
insert into destination_info values
(1,"guest","インターノウス","テストユーざー","いんたーのうす","てすとゆーざー","guest@internous.co.jp","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00");


/*
 * カテゴリーマスターテーブル
 */

create table m_category(
	id int primary key not null comment "ID",
	category_id int not null unique comment "カテゴリID",
	category_name varchar(20) not null unique comment "カテゴリ名",
	category_description varchar(100) comment "カテゴリ詳細",
	insert_date datetime not null comment "登録日",
	update_date datetime comment "更新日"
)
comment="カテゴリマスタテーブル"
;

/*
 * レビューテーブル
 */

drop table if exists review;

create table review(
	id int not null primary key auto_increment comment "ID",
	user_id varchar(16) not null comment "ユーザーID",
	product_id int not null comment "製品ID",
	product_name varchar(255) comment "商品名",
	review_title varchar(100) comment "タイトル",
	review_score int not null comment "評価",
	review_body varchar(255) comment "レビュー",
	regist_date datetime not null comment "投稿日",
	update_date datetime comment "修正日"
)
comment = "レビューテーブル"
;

insert into review values
(1, 1, 1,"Mission: Impossible", "最高でした！", 5, "買ってよかったです！", now(), null);

insert into m_category values
(1,1,"全てのカテゴリー","アクション、SF、コメディ、ホラー全てのカテゴリーが対象となります",now(), null),
(2,2,"アクション","アクションに関するカテゴリーが対象となります",now(),null),
(3,3,"コメディ","コメディに関するカテゴリーが対象となります",now(),null),
(4,4,"ドラマ","ドラマに関するカテゴリーが対象となります",now(),null),
(5,5,"ファンタジー","ファンタジーに関するカテゴリーが対象となります",now(),null),
(6,6,"ホラー","ホラーに関するカテゴリーが対象となります",now(),null),
(7,7,"SF","SFに関するカテゴリーが対象となります",now(),null),
(8,8,"スタッフのおススメ","スタッフのおススメに関するカテゴリーが対象となります",now(),null);