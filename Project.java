import java.util.Scanner;
interface I1
{
	public void Kpop();
}
class KPOP implements I1
{
	Scanner sc=new Scanner(System.in);
	{
	System.out.println("Enter Username:");
	String Username=sc.next();
	System.out.println("-------------------------------------");
	System.out.println("Enter Password:");
	String Password=sc.next();
	System.out.println("-------------------------------------");
	System.out.println("Login Successful");
	System.out.println("=====================================");
	}
	public void Kpop()
	{
		
		System.out.println("Click 1 to choose a Bands");
		System.out.println("Click 2 to choose Artists");
		int a=sc.nextInt();
		System.out.println("-------------------------------------");
		if (a>=0)
		{
			switch(a)
			{
				case 1:
				{
					System.out.println("Enter a Band Name from list Below:");
					System.out.println("BTS");
					System.out.println("BLACKPINCK");
					System.out.println("EXO");
					System.out.println("GOT7");
					System.out.println("BIGBANG");
					System.out.println("SEVENTEEN");
					System.out.println("TWICE");
					System.out.println("REDVELVET");
					System.out.println("GIRLSGENERATION");
					System.out.println("TXT");
					System.out.println("--------------------------------------------");
					String Band=sc.next();
					switch(Band)
					{
						case "BTS":
						{
							//BTS 1
							BTS ref1=new BTS();       //RM.1.1 //RM bts1=new RM();
							ref1.Members();
							ref1.Albums();
						}
						break;
						case "BLACKPINK":
						{

							//Blackpink 2
							BLACKPINK ref2=new BLACKPINK();
							ref2.Members();
							ref2.Albums();
						}
						break;
						case "EXO":
						{
							//EXO 3
							EXO ref3=new EXO();
							ref3.Members();
							ref3.Albums();
						}
						break;
						case "GOT7":
						{
							//GOT7 4
							GOT7 ref4=new GOT7();
							ref4.Members();
							ref4.Albums();
						}
						break;
						case "BIGBANG":
						{

							//BigBang 5
							BIGBANG ref5=new BIGBANG();
							ref5.Members();
							ref5.Albums();
						}
						break;
						case "SEVENTEEN":
						{

							//Seventeen 6
							SEVENTEEN ref6=new SEVENTEEN();
							ref6.Members();
							ref6.Albums();
						}
						break;
						case "TWICE":
						{

							//Twice 7
							TWICE ref7=new TWICE();
							ref7.Members();
							ref7.Albums();
						}
						break;
						case "REDVELVET":
						{

							//Red Velvet 8
							REDVELVET ref8=new REDVELVET();
							ref8.Members();
							ref8.Albums();
						}
						break;
						case "GIRLSGENERATION":
						{

							//Girls' Generations 9
							GIRLSGENERATION ref9=new GIRLSGENERATION();
							ref9.Members();
							ref9.Albums();
						}
						break;
						case "TXT":
						{

							//TXT 10
							TXT ref10=new TXT();
							ref10.Members();         
							ref10.Albums();
						}
						break;
						default:
						{
							System.out.println("Enter valid Band");
						}
						break;
					}          
				}
				break;
				case 2:
				{
					System.out.println("Enter a Artist Name from list Below:");
					System.out.println("Bts     | Blackpink| Exo       | BigBang");
					System.out.println("--------------------------------------------");
					System.out.println("RM      | JENNIE   | BAEKHYUN  | TAEYANG");
					System.out.println("JIN     | LISA     | CHEN      | GDRAGON");
					System.out.println("SUGA    | JISOO    | CHANYEOL  | TOP");
					System.out.println("JHOPE   | ROSE     | DO        | DAESUNG");
					System.out.println("JIMIN   |          | KAI       |");
					System.out.println("V       |          | SEHUN     |");
					System.out.println("JK      |          | XIUMIN    |");
					System.out.println("        |          | SUHO      |");
					System.out.println("        |          | LAY       |");
					System.out.println("=============================================");
					String Artist=sc.next();
					switch (Artist)
					{
						case "RM":
							RM B1=new RM();
						break;
						case "JIN":
							JIN B2=new JIN();
						break;
						case "SUGA":
							SUGA B3=new SUGA();
						break;
						case "JHOPE":
							JHOPE B4=new JHOPE();
						break;
						case "JIMIN":
							JIMIN B5=new JIMIN();
						break;
						case "V":
							V B6=new V();
						break;
						case "JUNGKOOK":
							JUNGKOOK B7=new JUNGKOOK();
						break;
						case "JENNIE":
							JENNIE BP1=new JENNIE();
						break;
						case "LISA":
							LISA BP2=new LISA();
						break;
						case "JISOO":
							JISOO BP3=new JISOO();
						break;
						case "ROSE":
							ROSE BP4=new ROSE();
						break;
						case "XIUMIN":
							XIUMIN E1=new XIUMIN();
						break;
						case "SUHO":
							SUHO E2=new SUHO();
						break;
						case "LAY":
							LAY E3=new LAY();
						break;
						case "BAEKHYUN":
							BAEKHYUN E4=new BAEKHYUN();
						break;
						case "CHEN":
							CHEN E5=new CHEN();
						break;
						case "CHANYEOL":
							CHANYEOL E6=new CHANYEOL();
						break;
						case "DO":
							DO E7=new DO();
						break;
						case "KAI":
							KAI E8=new KAI();
						break;
						case "SEHUN":
							SEHUN E9=new SEHUN();
						break;
						case "TAEYANG":
							TAEYANG BB1=new TAEYANG();
						break;
						case "GDRAGON":
							GDRAGON BB2=new GDRAGON();
						break;
						case "TOP":
							TOP BB3=new TOP();
						break;
						case "DAESUNG":
							DAESUNG BB4=new DAESUNG();
						break;
						default:
						{
							System.out.println("Enter valid Artist Name");
							
						}
						break;

					}
				}
				break;
				default:
				{
					System.out.println("Enter a Valid Input");
										
				}
				break;
			}
		}

		
	}
}

class Project
{
	static
	{
		System.out.println("::::::::::::::::::::::::::::::::");
		System.out.println(":                              :");
		System.out.println(":             KPOP             :");
		System.out.println(":                              :");
		System.out.println("::::::::::::::::::::::::::::::::");
	}
	public static void main(String args[])
	{
		KPOP K=new KPOP();
		K.Kpop();

		Scanner sc=new Scanner(System.in);
		System.out.println("Click 0 to choose another Band or Artist");
		int b=sc.nextInt();
		switch(b)
		{
			case 0:
				K.Kpop();
			default:
				System.out.println("SLAP`");
		}
	
	}
}

class Bands//super class 
{
	
	String OriginatedIn="South Korea";
	String LeaderOfTheGroup="Someone";
}
class Artists//super class
{
	String ArtistStageName="SN";
	String ArtistRealName="RN";
	private String family;
	public String getFamily()
	{
		return family;
	}
	
	public void setWealth(String name)
	{
		this.family = name ;
	}

}

class BTS extends Bands //1
{
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("BTS");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Originated In:"+OriginatedIn);
		System.out.println("Founder Company of Band:Bighit Entertainment");
		System.out.println("Company Website:https://ibighit.com ");
		System.out.println("Logo of Company:img.png");
		System.out.println("Band Name:BTS");
		System.out.println("Logo of Band:img.png");
		System.out.println("Band Website:https://ibighit.com>bts");
		System.out.println("No. of Members:7");
		System.out.println("Formed In:2010");
		System.out.println("Leader Of The Group:Rap Monster");
		System.out.println("FandomName:Army");
		System.out.println("Debut Day:June 12th,2013");
		System.out.println("Debut Album:2 Cool 4 Skool");
		System.out.println("No. of Albums Released:9 studio albums, 7 compilation albums, 6 extented plays and 1 soundtrack album");
	}

	public void Members()
	{
		String Member1="Rap Monster";
		String Member2="Jin";
		String Member3="Suga";
		String Member4="Jhope";
		String Member5="Jimin";
		String Member6="V";
		String Member7="Jk";
		System.out.println("Member 1:"+Member1);
		System.out.println("Member 2:"+Member2);
		System.out.println("Member 3:"+Member3);
		System.out.println("Member 4:"+Member4);
		System.out.println("Member 5:"+Member5);
		System.out.println("Member 6:"+Member6);
		System.out.println("Member 7:"+Member7);

	}
	
	public void Albums()//ref1.Albums();
	{
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("BTS's Albums");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("Debut Album:2 cool 4 skool");
		System.out.println("No. of Albums Released:9 studio albums and 7 compilation albums, 6 extented plays, 1 soundtrack album");
		System.out.println("Album 1: 2 cool 4 skool");
		System.out.println("Album 2:Dark & Wild");
		System.out.println("Album 3:Wake Up");
		System.out.println("Album 4:Youth");
		System.out.println("Album 5:Wings");
		System.out.println("Album 6:Face Yourself");
		System.out.println("Album 7:Love Yourself:Tear");
		System.out.println("Album 8:Map of the Soul:7");
		System.out.println("Album 9:Map of the Soul:7-The Journey");
		System.out.println("Album 10:Be");
		System.out.println("Album 11:Proof");
		System.out.println("Compilation Album 1=O!RUL8,2?");
		System.out.println("Compilation 2=The Best of Bangtan Sonyeondan -Korea Edition-");
		System.out.println("Compilation 3=The Most Beautiful Moment in Life:Young Forever");
		System.out.println("Compilation 4=Love Yourself: Her");
		System.out.println("Compilation 5=The Best of Bodan Shonendan -Japan Edition-");
		System.out.println("Compilation 6=BTS,the Best");
		System.out.println("Extended Play 1:O!RUL8,2?");
		System.out.println("Extended Play 2:Skool Luv Affair");
		System.out.println("Extended Play 3:The Most Beautiful Moment in Life, Pt. 1");
		System.out.println("Extended Play 4:Love Yourself: Her");
		System.out.println("Extended Play 5:Map of the Soul: Persona");
		System.out.println("Extended Play 6:The Most Beautiful Moment in Life, Pt. 2");
		System.out.println("Single 1:Dynamite");
		System.out.println("Single 2:Butter");
		System.out.println("Single 3:Permission to Dance");
		System.out.println("Collab With Coldplay:My Universe");
		System.out.println("Collab With Charli XCX:Dream Glow");
		System.out.println("Collab With juice Wrld:All Night");
		System.out.println("Collab With Lil Nas X:Seoul Town Road");
		System.out.println("Collab With Snoop Dogg:Bad Decisions");
		System.out.println("Collab With Lauv:Who");
		System.out.println("====================================================================================================================");
	}

}
class RM extends Artists//1.1
{
	RM AS1=new RM();
	AS1.setWealth("Father");

	String ArtistStageName="Rap Monster";
	String ArtistRealName="Kim Namjoon";
	{
		System.out.println("RM Stage Name:"+ArtistStageName);
		System.out.println("RM Real Name:"+ArtistRealName);
		System.out.println("RM Img:Img.jpg");
		System.out.println("RM Nationality:South Korean");
		System.out.println("RM Age:28");
		System.out.println("RM Date of Birth:september 12  1994");
		System.out.println("RM Height:5.11");
		System.out.println("RM Family:"+AS1.getFamily());
		System.out.println("RM Education:Apgujeong High School ,Global Cyber University");
		System.out.println("RM Profession:He is the leader of the BTS, Rapper,Singer-song writer and record producer ");
		System.out.println("RM First Solo:mixtape, RM, in 2015");
		System.out.println("RM Debut Album:Indigo, in 2022");
		System.out.println("RM Songs: 'Mono', ''4 O'Clock','Seoul Town Road','Monterlude','seoul','Smoke Sprite','Do You','Waste It On Me'");
		System.out.println("RM Collaborated with:V, Jungkook, Jimin, Wale, Younha, Warren G, Gaeko, Krizz Kaliko, MFBTY, So!YoON!, Fall Out Boy, Primary, and Lil Nas X");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class JIN extends Artists//1.1
{
	String ArtistStageName="JIN";
	String ArtistRealName="Kim Seokjin";
	
	{
		System.out.println("JIN Stage Name:"+ArtistStageName);
		System.out.println("JIN Real Name:"+ArtistRealName);
		System.out.println("JIN Img:Img.jpg");
		System.out.println("JIN Nationality:South Korean");
		System.out.println("JIN Age:30");
		System.out.println("JIN Date of Birth:December 4, 1992");
		System.out.println("JIN Height:5.10");
		System.out.println("JIN Education:Konkuk University ,Hanyang Cyber University");
		System.out.println("JIN Profession:He is a member of the BTS, Singer, song writer");
		System.out.println("JIN First Solo:Tonight, in 2019");
		System.out.println("JIN Debut Single Song:The Astronaut");
		System.out.println("JIN Songs:'Epiphany', 'Moon','It's Definitely You','Super Tuna', 'Yours', 'Abyss', 'Awake'");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class SUGA extends Artists//1.1
{
	String ArtistStageName="SUGA";
	String ArtistRealName="Min Yoongi";
	
	{
		System.out.println("Suga Stage Name:"+ArtistStageName);
		System.out.println("Suga Real Name:"+ArtistRealName);
		System.out.println("Suga Img:Img.jpg");
		System.out.println("Suga Nationality:South Korean");
		System.out.println("Suga Age:30");
		System.out.println("Suga Date of Birth:March 9, 1993");
		System.out.println("Suga Height:5.9");
		System.out.println("Suga Education:Apgujeong High School, Global Cyber University");
		System.out.println("Suga Profession:He is a member of the BTS, Rapper, song writer and Record Producer");
		System.out.println("Suga First Solo:mixtape, Agust D, in 2016");
		System.out.println("Suga Debut Album:D-Day,in 2023");
		System.out.println("Suga Songs:'Interlude: Shadow','Intro:The Most Beautiful Moment in Life','Give It To Me','724148','Daechwita','Agust D','Burn It','First Love','Tony Montana','Intro:Dt sugA','Interlude: Set Me Free','so far away'");
		System.out.println("Suga Collaborated with:Suran, Lee Sora, Epik High, Heize, Halsey, IU, MAX, Kim Jong Wan of Nell");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class JHOPE extends Artists//1.1
{
	String ArtistStageName="J-HOPE";
	String ArtistRealName="Jung Hoseok";

	{
		System.out.println("Jhope Stage Name:"+ArtistStageName);
		System.out.println("Jhope Real Name:"+ArtistRealName);
		System.out.println("Jhope Img:Img.jpg");
		System.out.println("Jhope Nationality:South Korean");
		System.out.println("Jhope Age:29");
		System.out.println("Jhope Date of Birth:February 18, 1994");
		System.out.println("Jhope Height:5.10");
		System.out.println("Jhope Education:Hanyang Cyber University, Global Cyber University");
		System.out.println("Jhope Profession:He is a member of the BTS, Rapper, Singer-song writer, Dancer and Record Producer");
		System.out.println("Jhope First Solo:mixtape, Hope World, in 2018");
		System.out.println("Jhope Debut Album:Jack in the Box,in 2022");
		System.out.println("Jhope Songs:'Chicken Noodle Soup','On the Street','Airplane','Daydream','Blue Side (Outro)','Base Line'");
		System.out.println("Jhope Collaborated with:Crush, Becky G, J.Cole");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class JIMIN extends Artists//1.1
{
	String ArtistStageName="JIMIN";
	String ArtistRealName="Park Jimin";
	
	{
		System.out.println("Jimin Stage Name:"+ArtistStageName);
		System.out.println("Jimin Real Name:"+ArtistRealName);
		System.out.println("Jimin Img:Img.jpg");
		System.out.println("Jimin Nationality:South Korean");
		System.out.println("Jimin Age:29");
		System.out.println("Jimin Date of Birth:October 13, 1995");
		System.out.println("Jimin Height:5.9");
		System.out.println("Jimin Education:Korean Arts High School, Global Cyber University");
		System.out.println("Jimin Profession:He is a member of the BTS, Singer and Dancer");
		System.out.println("Jimin First Solo:Promise, in 2018");
		System.out.println("Jimin Debut Album:Face in 2023");
		System.out.println("Jimin Songs:'With You','Lie','Serendipity','Filter','Friends','Christmas Love','Vibe'");
		System.out.println("Jimin Collaborated with:Jungkook, V, RM Taeyang, Ha Sung-woon,Lauv");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class V extends Artists//1.1
{
	String ArtistStageName="V";
	String ArtistRealName="Kim Taehyung";

	{
		System.out.println("V Stage Name:"+ArtistStageName);
		System.out.println("V Real Name:"+ArtistRealName);
		System.out.println("V Img:Img.jpg");
		System.out.println("V Nationality:South Korean");
		System.out.println("V Age:27");
		System.out.println("V Date of Birth:December 30, 1995");
		System.out.println("V Height:5.10");
		System.out.println("V Education:Korean Arts High School, Global Cyber University");
		System.out.println("V Profession:He is a member of the BTS, Singer and Actor");
		System.out.println("V First Solo:Stigma, in 2016");
		System.out.println("V Debut Album:Not yet");
		System.out.println("V Songs:'Singularity','Inner Child','Serendipity','Scenery','Friends','Christmas Tree','It's Definitely You','4 O'Clock','Winter Bear','Sweet Night','Snow Flower'");
		System.out.println("V Acting Debut:He played a role of Suk Han-sung in 'Hwarang' series in 2016");		
		System.out.println("V Collaborated with:Jin, RM, Peakboy, Jimin");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class JUNGKOOK extends Artists//1.1
{
	String ArtistStageName="Jungkook";
	String ArtistRealName="Jeon Jung-kook";

	{
		System.out.println("JK Stage Name:"+ArtistStageName);
		System.out.println("JK Real Name:"+ArtistRealName);
		System.out.println("JK Img:Img.jpg");
		System.out.println("JK Nationality:South Korean");
		System.out.println("JK Age:25");
		System.out.println("JK Date of Birth:September 1, 1997");
		System.out.println("JK Height:5.10");
		System.out.println("JK EducationSchool of Performing Arts Seoul, Global Cyber University");
		System.out.println("JK Profession:He is the member of the BTS, Singer and Dancer");
		System.out.println("JK First Solo:Begin, in 2016");
		System.out.println("JK Debut Album:Not yet");
		System.out.println("JK Songs:'Euphoria','My Time','Stay Alive','Left and Right','Dreamers','Still With You','Waste It On Me'");
		System.out.println("JK Collaborated with:RM, Lauv,, Suga, Charlie Puth , Jimin");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}

class BLACKPINK extends Bands//2 
{
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Blackpink");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Originated In:"+OriginatedIn);
		System.out.println("Founder Company of Band:YG Entertainment");
		System.out.println("Company Website:www.ygfamily.com");
		System.out.println("Logo of Company:img.png");
		System.out.println("Band Name:BLACKPINK");
		System.out.println("Logo of Band:img.png");
		System.out.println("Band Website:www.blackpinkmusic.com");
		System.out.println("No. of Members:4");
		System.out.println("Formed In:2016");
		System.out.println("Leader Of The Group:doesn't have official leader");
		System.out.println("FandomName:Blinks");
		System.out.println("Debut Day:August 8th,2016");
		System.out.println("Debut Album:Square One");
		System.out.println("No. of Albums Released:4 live albums, 2 studio albums, 1 Compilation album and 3 Extended Plays");

	}
	public void Members()
	{
		String Member1="Jennie";
		String Member2="Lisa";
		String Member3="Jisoo";
		String Member4="Rose";
		System.out.println("Member 1:"+Member1);
		System.out.println("Member 2:"+Member2);
		System.out.println("Member 3:"+Member3);
		System.out.println("Member 4:"+Member4);

		
	}
	
	public void Albums()//ref1.Albums();
	{

		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("BLACKPINK's Albums");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Debut Album:Square One");
		System.out.println("No. of Albums Released:4 live albums and 2 studio albums");
		System.out.println("Album 1:The Album");
		System.out.println("Album 2:Born Pink");
		System.out.println("Compilation Album 1:Blackpink in Your Area");
		System.out.println("Extended Play 1:Square Up");
		System.out.println("Extended Play 2:Kill This Love");
		System.out.println("Extended Play 2:Blackpink");
		System.out.println("Live Album 1:Blackpink Arena Tour 2018 Special Final In Kyocera Dome Osaka");
		System.out.println("Live Album 2:Blackpink 2018 Tour 'In Your Area' Seoul");
		System.out.println("Live Album 3:Blackpink Tokyo Dome");
		System.out.println("Live Album 4:Blackpink 2021 'The Show' Live");
		System.out.println("Collab with Dua Lipa:Kiss and Make up");
		System.out.println("Collab With Selena Gomez:Ice Cream");
		System.out.println("====================================================================================================================");

	}
}
class JENNIE extends Artists//1.1
{
	String ArtistStageName="Jennie";
	String ArtistRealName="Kim Jennie";
	
	{
		System.out.println("Jennie Stage Name:"+ArtistStageName);
		System.out.println("Jennie Real Name:"+ArtistRealName);
		System.out.println("Jennie Img:Img.jpg");
		System.out.println("Jennie Nationality:South Korean");
		System.out.println("Jennie Age:27");
		System.out.println("Jennie Date of Birth:January 16, 1996");
		System.out.println("Jennie Height:5.4");
		System.out.println("Jennie Education:Cheongdam Elementary School ,Waikowhai Intermediate School in Auckland, ACG Parnell College");
		System.out.println("Jennie Profession:She is a member of the Blackpink, Rapper and Singer");
		System.out.println("Jennie First Solo:Solo, in 2018");
		System.out.println("Jennie Debut Album:not yet");
		System.out.println("Jennie Songs:Solo");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class LISA extends Artists//1.1
{
	String ArtistStageName="Lisa";
	String ArtistRealName="Lalisa Manoba";

	{
		System.out.println("Lisa Stage Name:"+ArtistStageName);
		System.out.println("Lisa Real Name:"+ArtistRealName);
		System.out.println("Lisa Img:Img.jpg");
		System.out.println("Lisa Nationality:Thai");
		System.out.println("Lisa Age:26");
		System.out.println("Lisa Date of Birth:March 27, 1997");
		System.out.println("Lisa Height:5.6");
		System.out.println("Lisa Education:Praphamontree School I and II");
		System.out.println("Lisa Profession:She is a member of the Blackpink, Rapper, Singer and Dancer");
		System.out.println("Lisa First Solo:Lalisa , in 2021");
		System.out.println("Lisa Debut Album:Lalisa ");
		System.out.println("Lisa Songs:'Money', 'SG'");
		System.out.println("Lisa Collaborated with: Taeyang, DJ Snake, Ozuna, Megan Thee Stallion ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class JISOO extends Artists//1.1
{
	String ArtistStageName="Jisoo";
	String ArtistRealName="Kim Ji-soo";
	{
		System.out.println("Jisoo Stage Name:"+ArtistStageName);
		System.out.println("Jisoo Real Name:"+ArtistRealName);
		System.out.println("Jisoo Img:Img.jpg");
		System.out.println("Jisoo Nationality:South Korean");
		System.out.println("Jisoo Age:28");
		System.out.println("Jisoo Date of Birth:January 3, 1995");
		System.out.println("Jisoo Height:5.4");
		System.out.println("Jisoo Education:School of Performing Arts Seoul");
		System.out.println("Jisoo Profession:She is a member of the Blackpink, Singer and Actress");
		System.out.println("Jisoo First Solo:Me");
		System.out.println("Jisoo Debut Album:Me, in 2023");
		System.out.println("Jisoo Acting Debut:She did a cameo role in the series 'The Producers' in 2015 and first leading role in the series Snowdrop in 2021–22");		
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class ROSE extends Artists//1.1
{
	String ArtistStageName="Rosé";
	String ArtistRealName="	Roseanne Park";

	{
		System.out.println("Rose Stage Name:"+ArtistStageName);
		System.out.println("Rose Real Name:"+ArtistRealName);
		System.out.println("Rose Img:Img.jpg");
		System.out.println("Rose Nationality:South Korea, New Zealand");
		System.out.println("Rose Age:26");
		System.out.println("Rose Date of Birth:11 February 1997");
		System.out.println("Rose Height:5.6");
		System.out.println("Rose Education:Kew East Primary School,  Canterbury Girls' Secondary College");
		System.out.println("Rose Profession:She is a member of the Blackpink, Singer and Dancer");
		System.out.println("Rose First Solo:R");
		System.out.println("Rose Debut Album:R, in 2021");
		System.out.println("Rose Songs:'On the Ground', 'Without you', 'Build a Bitch', 'EYES CLOSED'");
		System.out.println("Rose Collaborated with: G-DRAGON, Bella Poarch, Halsey ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class EXO extends Bands//3
{

	public void Members()
	{
		String Member1="Xiumin";
		String Member2="Suho";
		String Member3="Lay";
		String Member4="Baekhyun";
		String Member5="Chen";
		String Member6="Chanyeol";
		String Member7="D.O";
		String Member8="Kai";
		String Member9="Sehun";
		System.out.println("Member 1:"+Member1);
		System.out.println("Member 2:"+Member2);
		System.out.println("Member 3:"+Member3);
		System.out.println("Member 4:"+Member4);
		System.out.println("Member 5:"+Member5);
		System.out.println("Member 6:"+Member6);
		System.out.println("Member 7:"+Member7);
		System.out.println("Member 8:"+Member8);
		System.out.println("Member 9:"+Member9);

	}
	
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("EXO");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Originated In:"+OriginatedIn);
		System.out.println("Founder Company of Band:SM Entertainment");
		System.out.println("Company Website:https://www.smentertainment.com");
		System.out.println("Logo of Company:img.png");
		System.out.println("Band Name:EXO");
		System.out.println("Logo of Band:img.png");
		System.out.println("Band Website:https://www.smtown.com");
		System.out.println("No. of Members:9");
		System.out.println("Formed In:2011");
		System.out.println("Leader Of The Group:Suho");
		System.out.println("FandomName:EXO-L");
		System.out.println("Debut Day:April 8th,2012");
		System.out.println("Debut Album:XOXO");
		System.out.println("No. of Albums Released:7 studio albums, 4 Live albums and 7 extented plays");

	}
	
	public void Albums()
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("EXO's Albums");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Debut Album:XOXO");
		System.out.println("No. of Albums Released:7 studio albums, 4 Live albums and 7 extented plays");		
		System.out.println("Album 1:XOXO");
		System.out.println("Album 2:Exodus");
		System.out.println("Album 3:Ex'Act");
		System.out.println("Album 4:The War");
		System.out.println("Album 5:Don't Mess Up My Tempo");
		System.out.println("Album 6:Countdown");
		System.out.println("Extended Play 1:Mama ");
		System.out.println("Extended Play 2:Miracles in December");
		System.out.println("Extended Play 3:Overdose");
		System.out.println("Extended Play 4:Sing for you");
		System.out.println("Extended Play 5:For Life");
		System.out.println("Extended Play 6:Universe");
		System.out.println("Extended Play 7:Don't fight the Feeling");
		System.out.println("Live Album 1:Exology Chapter 1: The Lost Planet");
		System.out.println("Live Album 2:EXO PLANET No. 3 - The EXO'rDIUM [dot]");
		System.out.println("Live Album 3:EXO PLANET");
		System.out.println("Live Album 4:EXO PLANETn");
		System.out.println("Collab with Star Wars:Lightsaber");
		System.out.println("Collab with Yoo Jae-suk:Dancing King");
		System.out.println("====================================================================================================================");
	}
}
class XIUMIN extends Artists//1.1
{
	String ArtistStageName="Xiumin";
	String ArtistRealName="Kim Min-seok";

	{
		System.out.println("Xiumin Stage Name:"+ArtistStageName);
		System.out.println("Xiumin Real Name:"+ArtistRealName);
		System.out.println("Xiumin Img:Img.jpg");
		System.out.println("Xiumin Nationality:South Korea");
		System.out.println("Xiumin Age:33");
		System.out.println("Xiumin Date of Birth:March 26, 1990");
		System.out.println("Xiumin Height:5.8");
		System.out.println("Xiumin Education:Catholic Kwandong University");
		System.out.println("Xiumin Profession:He is a member of the EXO, Singer and Actor");
		System.out.println("Xiumin First Solo:You Are the One");
		System.out.println("Xiumin Debut Album:You, in 2019");
		System.out.println("Xiumin Songs:'Return: The Promise of That Day', 'Young & Free', 'For You', 'Call You Bae'");
		System.out.println("Xiumin Acting Debut:He did a leading role in the web drama 'Falling for Challenge' in 2015 and  in he played a role in 'Seondal: The Man Who Sells the River' movie in 2016");		
		System.out.println("Xiumin Collaborated with: Jimin, Chen, Baekhyun, Mark, Onew, Yoon Ji-sung ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class SUHO extends Artists//1.1
{
	String ArtistStageName="Suho";
	String ArtistRealName="Kim Jun-myeon";

	{
		System.out.println("Suho Stage Name:"+ArtistStageName);
		System.out.println("Suho Real Name:"+ArtistRealName);
		System.out.println("Suho Img:Img.jpg");
		System.out.println("Suho Nationality:South Korea");
		System.out.println("Suho Age:31");
		System.out.println("Suho Date of Birth:May 22, 1991");
		System.out.println("Suho Height:5.8");
		System.out.println("Suho Education:Whimoon High School,Kyung Hee Cyber University, Inha University ");
		System.out.println("Suho Profession:He is a member of the EXO, Singer, Songwriter, and Actor");
		System.out.println("Suho First Solo:Self-Portrait");
		System.out.println("Suho Debut Album:Self-Portrait, in 2020");
		System.out.println("Suho Songs:'Dinner', 'Turn Off The Alarm', 'Saving Santa's og sundtrack', 'Grey Suit '");
		System.out.println("Suho Acting Debut:He did a cameo role in 'Attack on the Pin-Up Boys' in 2007, acted in 'One Way Trip ' movie in 2016 ,'The Universe's Star' drama in 2017, 'Rich Man' drama in 2018 and 'How Are U Bread' web drama in 2020");		
		System.out.println("Suho Collaborated with: Jang Jae-in, Mew Suppasit, Jung Eun-ji");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class LAY extends Artists//1.1
{
	String ArtistStageName="Lay Zhang";
	String ArtistRealName="Zhang Yixing";

	{
		System.out.println("Lay Stage Name:"+ArtistStageName);
		System.out.println("Lay Real Name:"+ArtistRealName);
		System.out.println("Lay Img:Img.jpg");
		System.out.println("Lay Nationality:China");
		System.out.println("Lay Age:31");
		System.out.println("Lay Date of Birth:7 October 1991");
		System.out.println("Lay Height:5.10");
		System.out.println("Lay Education: Hunan Normal University ");
		System.out.println("Lay Profession:He is a member of the EXO,rapper, singer, songwriter, dancer, actor, producer and businessman");
		System.out.println("Lay First Solo:Monodrama");
		System.out.println("Lay Debut Album:?");
		System.out.println("Lay Songs:'Lose Control','What U Need?','Namanana', 'Lit', 'Producer', 'Winter Special Gift' 'Honey', 'East', 'West', 'Let's Shut Up & Dance', 'No Man's Land', 'Lovebird', 'Love You More', 'Clear Sky Ballad' ");
		System.out.println("Lay Acting Debut:He did a acting in 'Ex-Files 2' movie in 2015 ,'The Mystic Nine' series in 2016, 'Kung Fu Yoga' movie in 2017,'The Island ' movie in 2018, 'The Golden Eyes ' in 2019, 'Empress of the Ming ' series in 2019, 'Crime Crackdown' series in 2021 ");		
		System.out.println("Lay Collaborated with: Jason Derulo, NCT 127, Jasmine Sokko,  Far East Movement, Steve Aoki, Panta Q");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class BAEKHYUN extends Artists//1.1
{
	String ArtistStageName="Baekhyun";
	String ArtistRealName="Byun Baek-hyun";
	{
		System.out.println("Baehyung Stage Name:"+ArtistStageName);
		System.out.println("Baehyung Real Name:"+ArtistRealName);
		System.out.println("Baehyung Img:Img.jpg");
		System.out.println("Baehyung Nationality:South Korea");
		System.out.println("Baehyung Age:31");
		System.out.println("Baehyung Date of Birth:May 6, 1992");
		System.out.println("Baehyung Height:5.9");
		System.out.println("Baehyung Education:  Jungwon High School ");
		System.out.println("Baehyung Profession:He is a member of the EXO, singer, songwriter and actor");
		System.out.println("Baehyung First Solo:Beautiful");
		System.out.println("Baehyung Debut Album:City Lights, in 2019");
		System.out.println("Baehyung Acting Debut:He did a acting in 'Moon Lovers: Scarlet Heart Ryeo' movie in 2016");
		System.out.println("Baehyung Songs:'Delight', 'Bambi', 'Dream', 'The Day', 'For You', 'Rain', 'Take You Home', 'Young'");
		System.out.println("Baehyung Collaborated with:  Suzy ,  K.Will, Chen, Xiumin, Soyou,  Loco ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class CHEN extends Artists//1.1
{
	String ArtistStageName="Chen";
	String ArtistRealName="Kim Jong-dae";
	{
		System.out.println("Chen Stage Name:"+ArtistStageName);
		System.out.println("Chen Real Name:"+ArtistRealName);
		System.out.println("Chen Img:Img.jpg");
		System.out.println("Chen Nationality:South Korea");
		System.out.println("Chen Age:30");
		System.out.println("Chen Date of Birth:September 21, 1992");
		System.out.println("Chen Height:5.8");
		System.out.println("Chen Education: Hanyang Cyber University ");
		System.out.println("Chen Profession:He is a member of the EXO, singer, songwriter");
		System.out.println("Chen First Solo:April, and a Flower,");
		System.out.println("Chen Debut Album:What U Need?, in 2016");
		System.out.println("Chen Songs:'The Best Luck', 'Best Luck', 'Everytime', 'Dear My Dear', 'Shall We?' 'When I Was... When U Were..', 'A Day Without You', 'Lil' Something', 'For You', 'Years', 'Nosedive', 'Bye Babe', 'Cherry Blossom Love Song' ");
		System.out.println("Chen Collaborated with: f(x)'s Krystal , Shinee's Jonghyun, Punch, Heize,  Xiumin, Baekhyun, DJ Alesso, Dynamic Duo, 10cm ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class CHANYEOL extends Artists//1.1
{
	String ArtistStageName="Chanyeol";
	String ArtistRealName="Park Chan-yeol ";

	{
		System.out.println("Lay Stage Name:"+ArtistStageName);
		System.out.println("Lay Real Name:"+ArtistRealName);
		System.out.println("Lay Img:Img.jpg");
		System.out.println("Lay Nationality:South Korean");
		System.out.println("Lay Age:30");
		System.out.println("Lay Date of Birth:November 27, 1992");
		System.out.println("Lay Height:6.1");
		System.out.println("Lay Education:Hyundai High School, Kyung Hee Cyber University, Inha University ");
		System.out.println("Lay Profession:He is a member of the EXO,rapper, singer, songwriter, actor, producer and model");
		System.out.println("Lay First Solo:SSFW");
		System.out.println("Lay Debut Album:?");
		System.out.println("Lay Songs:'I Hate You','Freal Luv','Stay With Me', 'Let Me Love You', 'We Young', 'Tomorrow'");
		System.out.println("Lay Acting Debut:He did a acting in 'Salut d'Amour' drama in 2015 ,'Exo Next Door' web series in 2015,'Missing 9' series in 2017");		
		System.out.println("Lay Collaborated with: Yuan Shanshan, Tinashe, Punch, Junggigo,  Sehun, Panta Q");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class DO extends Artists//1.1
{
	String ArtistStageName="D.O.";
	String ArtistRealName="Doh Kyung-soo";

	{
		System.out.println("Do Stage Name:"+ArtistStageName);
		System.out.println("Do Real Name:"+ArtistRealName);
		System.out.println("Do Img:Img.jpg");
		System.out.println("Do Nationality:South Korean");
		System.out.println("Do Age:30");
		System.out.println("Do Date of Birth:January 12, 1993");
		System.out.println("Do Height:5.8");
		System.out.println("Do Education:Goyang Poongsan Elementary School,  Baekshin Middle School and Baekseok High School");
		System.out.println("Do Profession:He is a member of the EXO, singer and actor");
		System.out.println("Do First Solo:Empathy");
		System.out.println("Do Debut Album:Empathy in 2021");
		System.out.println("Do Songs:'Crying Out','Tell Me (What Is Love)','Don't Worry'");
		System.out.println("Do Acting Debut:He did a acting in 'Cart' movie in 2014 ,'It's Okay, That's Love' series in 2014,'Hello Monster' series in 2015");		
		System.out.println("Do Collaborated with:f(x), Yoo Young-jin, Jo Jung-suk");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class KAI extends Artists//1.1
{
	String ArtistStageName="Kai";
	String ArtistRealName="Kim Jong-in";

	{
		System.out.println("Do Stage Name:"+ArtistStageName);
		System.out.println("Do Real Name:"+ArtistRealName);
		System.out.println("Do Img:Img.jpg");
		System.out.println("Do Nationality:South Korean");
		System.out.println("Do Age:29");
		System.out.println("Do Date of Birth:January 14, 1994");
		System.out.println("Do Height:6.0");
		System.out.println("Do Education:School of Performing Arts Seoul");
		System.out.println("Do Profession:He is a member of the EXO, singer, model, actor, and dancer");
		System.out.println("Do First Solo:Kai");
		System.out.println("Do Debut Album:Kai in 2021");
		System.out.println("Do Songs:'Peaches','Mmmh','MAXSTEP', 'Rover'");
		System.out.println("Do Acting Debut:He did a acting in 'Andante ' series in 2017 ,'Choco Bank' web series in 2016,'Spring Has Come' series in 2018");		
		System.out.println("Do Collaborated with:Taemin, Younique");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class SEHUN extends Artists//1.1
{
	String ArtistStageName="Sehun";
	String ArtistRealName="Oh Se-hun";

	{
		System.out.println("Do Stage Name:"+ArtistStageName);
		System.out.println("Do Real Name:"+ArtistRealName);
		System.out.println("Do Img:Img.jpg");
		System.out.println("Do Nationality:South Korean");
		System.out.println("Do Age:29");
		System.out.println("Do Date of Birth:April 12, 1994");
		System.out.println("Do Height:6.0");
		System.out.println("Do Education:School of Performing Arts Seoul");
		System.out.println("Do Profession:He is a member of the EXO, rapper, singer, actor, model, and dancer");
		System.out.println("Do First Solo:On me");
		System.out.println("Do Debut Album:?");
		System.out.println("Do Songs:'We Young','Beat Maker','Go', 'Rover'");
		System.out.println("Do Acting Debut:He did a acting in 'Secret Queen Makers' web series in 2018 ,'Now, We Are Breaking Up' drama in 2021 and'Dokgo Rewind' web series in 2018");		
		System.out.println("Do Collaborated with:Chanyeol");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

	}
}
class GOT7 extends Bands //4
{
	
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("GOT7");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Originated In:"+OriginatedIn);
		System.out.println("Founder Company of Band:JYP Entertainment");
		System.out.println("Company Website:https://www.jype.com ");
		System.out.println("Logo of Company:img.png");
		System.out.println("Band Name:GOT7");
		System.out.println("Logo of Band:img.png");
		System.out.println("Band Website:https://www.jype.com>GOT7");
		System.out.println("No. of Members:7");
		System.out.println("Formed In:2014");
		System.out.println("Leader Of The Group:Jay B");
		System.out.println("FandomName:iGOT7");
		System.out.println("Debut Day:Jan 16th,2014");
		System.out.println("Debut Album:Identify");
		System.out.println("No. of Albums Released:5 studio albums,16 extented plays and 22 Singles");

	}

	public void Members()
	{
		String Member1="Jay B";
		String Member2="Mark";
		String Member3="Jackson";
		String Member4="Jinyoung";
		String Member5="Youngjae";
		String Member6="BamBam";
		String Member7="YugYeom";
		System.out.println("Member 1:"+Member1);
		System.out.println("Member 2:"+Member2);
		System.out.println("Member 3:"+Member3);
		System.out.println("Member 4:"+Member4);
		System.out.println("Member 5:"+Member5);
		System.out.println("Member 6:"+Member6);
		System.out.println("Member 7:"+Member7);

	}
	
	

	public void Albums()//ref1.Albums();
	{

		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("GOT7's Albums");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Debut Album:Identify");
		System.out.println("No. of Albums Released:5 studio albums,16 extented plays and 22 Singles");		
		System.out.println("Album 1:Identify");
		System.out.println("Album 2:Moriagatteyo");
		System.out.println("Album 3:Flight Log: Turbulence");
		System.out.println("Album 4:Present: You");
		System.out.println("Album 5:Breath of Love: Last Piece");
		System.out.println("Extended Play 1:Got It? ");
		System.out.println("Extended Play 2:Got Love");
		System.out.println("Extended Play 3:Flight Log: Departure");
		System.out.println("Extended Play 4:Just Right");
		System.out.println("Extended Play 5:Mad");
		System.out.println("Extended Play 6:Hey Yah");
		System.out.println("Extended Play 7:Flight Log: Arrival");
		System.out.println("Extended Play 8:7 for 7 ");
		System.out.println("Extended Play 9:Turn Up");
		System.out.println("Extended Play 10:Eyes on You");
		System.out.println("Extended Play 11:I Won't Let You Go");
		System.out.println("Extended Play 12:Spinning Top");
		System.out.println("Extended Play 13:Love Loop");
		System.out.println("Extended Play 14:Call My Name");
		System.out.println("Extended Play 15:Dye");
		System.out.println("Extended Play 16:Got7");
		System.out.println("Single 1:Girls, Girls, Girls");
		System.out.println("Single 2:Nanana");
		System.out.println("Single 3:Encore");
		System.out.println("Single 4:Last Piece");
		System.out.println("Single 5:Breath");
		System.out.println("Single 6:Not by the Moon");
		System.out.println("Single 7:You Calling My Name");
		System.out.println("Single 8:Eclipse");
		System.out.println("Single 9:Miracle");
		System.out.println("Single 10:Lullaby");
		System.out.println("Single 11:Look");
		System.out.println("Single 12:One and Only You");
		System.out.println("Single 13:You Are");
		System.out.println("Single 14:Never Ever");
		System.out.println("Single 15:Hard Carry");
		System.out.println("Single 16:Home Run");
		System.out.println("Single 17:Fly");
		System.out.println("Single 18:Confession Song");
		System.out.println("Single 19:If You Do");
		System.out.println("Single 20:Just Right");
		System.out.println("Single 21:Stop Stop It");
		System.out.println("Single 22:A");
		System.out.println("Collab with SISTAR member Hyolyn:One and Only You");
		System.out.println("====================================================================================================================");
	}
}

class BIGBANG extends Bands //4
{
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Big Bang");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Originated In:"+OriginatedIn);
		System.out.println("Founder Company of Band:YG Entertainment");
		System.out.println("Company Website:https://www.ygfamily.com ");
		System.out.println("Logo of Company:img.png");
		System.out.println("Band Name:BIG BANG");
		System.out.println("Logo of Band:img.png");
		System.out.println("Band Website:https://ygex.jp › bigbang");
		System.out.println("No. of Members:4");
		System.out.println("Formed In:2006");
		System.out.println("Leader Of The Group:G-Dragon");
		System.out.println("FandomName:V.I.P");
		System.out.println("Debut Day:Sep 23rd,2006");
		System.out.println("Debut Album:Big Bang Vol.1-Since 2007");
		System.out.println("No. of Albums Released:8 studio albums,8 extented plays, 36 Singles,7 Single Albums,8 Compilation Albums and 10 Live Albums");

	}

	public void Members()
	{
		String Member1="Taeyang";
		String Member2="G-Dragon";
		String Member3="T.O.P";
		String Member4="Daesung";
		System.out.println("Member 1:"+Member1);
		System.out.println("Member 2:"+Member2);
		System.out.println("Member 3:"+Member3);
		System.out.println("Member 4:"+Member4);

	}

	public void Albums()//ref1.Albums();
	{
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("BigBang's Albums");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Debut Album:Big Bang Vol.1-Since 2007");
		System.out.println("No. of Albums Released:8 studio albums,8 extented plays, 36 Singles,7 Single Albums,8 Compilation Albums and 10 Live Albums");
		System.out.println("Album 1:Big Bang Vol.1-Since 2007");
		System.out.println("Album 2:Remember");
		System.out.println("Album 3:Made");
		System.out.println("Album 4:Number 1");
		System.out.println("Album 5:Big Bang");
		System.out.println("Album 6:Big Bang 2");
		System.out.println("Album 7:Alive");
		System.out.println("Album 8:Made Series");
		System.out.println("Extended Play 1:Always");
		System.out.println("Extended Play 2:Hot Issues");
		System.out.println("Extended Play 3:Tonight");
		System.out.println("Extended Play 4:Stand Up");
		System.out.println("Extended Play 5:Alive");
		System.out.println("Extended Play 6:For the World");
		System.out.println("Extended Play 7:Special Final in Dome Memorial Collection");
		System.out.println("Extended Play 8:With U");
		System.out.println("Compilation 1=Asia Best 2006–2009");
		System.out.println("Compilation 2=The Ultimate -International Best-");
		System.out.println("Compilation 3=The Best of BIGBANG");
		System.out.println("Compilation 4=BIGBANG The Non Stop MIX");
		System.out.println("Compilation 5=BIGBANG Best Selection");
		System.out.println("Compilation 6=BIGBANG Non Stop Mega Mix mixed by DJ WILDPARTY");
		System.out.println("Compilation 7=The Best of Big Bang 2006–2014");
		System.out.println("Compilation 8=Best Selection Hi Quality CD");
		System.out.println("Live Album 1:First Live Concert: The Real");
		System.out.println("Live Album 2:Second Live Concert: The Great");
		System.out.println("Live Album 3:2009 Big Show");
		System.out.println("Live Album 4:2010 Big Show");
		System.out.println("Live Album 5:2011 Big Show");
		System.out.println("Live Album 6:Alive Tour 2012: Live in Seoul");
		System.out.println("Live Album 7:2014 BIGBANG +a IN SEOUL");
		System.out.println("Live Album 8:Alive GALAXY Tour 2013:The Final in Seoul");
		System.out.println("Live Album 9:2016 Big Bang World Tour [MADE] Final in Seoul Live");
		System.out.println("Live Album 10:Big Bang 10 The Concert 0.TO.10 Final In Seoul Live");
		System.out.println("Single 1:We Belong Together");
		System.out.println("Single 2:La La La");
		System.out.println("Single 3:Forever with U");
		System.out.println("Single 4:Dirty Cash");
		System.out.println("Single 5:Lies");
		System.out.println("Single 6:Last Farewell");
		System.out.println("Single 7:How Gee");
		System.out.println("Single 8:Still Life");
		System.out.println("Single 9:Haru Haru");
		System.out.println("Single 10:Sunset Glow");
		System.out.println("Single 11:My Heaven");
		System.out.println("Single 12:Gara Gara Go!!");
		System.out.println("Single 13:Bringing you Love");
		System.out.println("Single 14:Love Song");
		System.out.println("Single 15:Blue");
		System.out.println("Single 16:Koe o Kikasete");
		System.out.println("Single 17:Tell me Goodbye");
		System.out.println("Single 18:Beautiful Hangover");
		System.out.println("Single 19:Fantastic Baby");
		System.out.println("Single 20:F;ower Road");
		System.out.println("Single 21:Monster");
		System.out.println("Single 22:Loser");
		System.out.println("Single 23:Bad boy");
		System.out.println("Single 24:Bae Bae");
		System.out.println("Single 25:Bang Bang Bang");
		System.out.println("Single 26:we like 2 Pary");
		System.out.println("Single 27:If You");
		System.out.println("Single 28:Sober");
		System.out.println("Single 29:Zutter");
		System.out.println("Single 30:Fxxk It");
		System.out.println("Single 31:Let's Not Fall in Love");
		System.out.println("Single 32:Last Dance");
		System.out.println("Single Album 1:Big Bang First Single");
		System.out.println("Single Album 2:Big Bang Is V.I.P");
		System.out.println("Single Album 3:Big Bang 03");
		System.out.println("Single Album 4:M");
		System.out.println("Single Album 5:A");
		System.out.println("Single Album 6:D");
		System.out.println("Single Album 7:E");
		System.out.println("Collab with 2NE1:Lollipop");
		System.out.println("Collab with GD & TOP:Zutter");
		System.out.println("====================================================================================================================");
	}
}
class TAEYANG extends Artists//1.1
{
	String ArtistStageName="Taeyang";
	String ArtistRealName="Dong Young-bae";

	{
		System.out.println("Taeyang Stage Name:"+ArtistStageName);
		System.out.println("Taeyang Real Name:"+ArtistRealName);
		System.out.println("Taeyang Img:Img.jpg");
		System.out.println("Taeyang Nationality:South Korean");
		System.out.println("Taeyang Age:34");
		System.out.println("Taeyang Date of Birth:May 18, 1988");
		System.out.println("Taeyang Height:5.4");
		System.out.println("Taeyang Education:Daejin University");
		System.out.println("Taeyang Profession:He is a member of the BigBang, singer, songwriter and dancer");
		System.out.println("Taeyang First Solo:My Girl");
		System.out.println("Taeyang Debut Album: Hot in 2008");
		System.out.println("Taeyang Songs:'Only Look at Me','Prayer ','Where U At', 'Wedding Dress', 'Solar', 'Eyes, Nose, Lips'");
		System.out.println("Taeyang Collaborated with:Teddy Park, Yang Hyun Suk, G-Dragon,  Tablo");

	}
}
class GDRAGON extends Artists//1.1
{
	String ArtistStageName="G-Dragon ";
	String ArtistRealName="Kwon Ji-yong";

	{
		System.out.println("Do Stage Name:"+ArtistStageName);
		System.out.println("Do Real Name:"+ArtistRealName);
		System.out.println("Do Img:Img.jpg");
		System.out.println("Do Nationality:South Korean");
		System.out.println("Do Age:34");
		System.out.println("Do Date of Birth:August 18, 1988 ");
		System.out.println("Do Height:5.8");
		System.out.println("Do Education:National High School of Traditional Arts, SEJONG UNIVERSITY, Gukje Cyber University");
		System.out.println("Do Profession:He is a member of the BigBang, rapper, singer, songwriter, record producer, entrepreneur and fashion designer");
		System.out.println("Do First Solo:On me");
		System.out.println("Do Debut Album:Heartbreaker in 2009");
		System.out.println("Do Songs:'One of a Kind ','Crayon','That XX', 'Butterfly','Shine a Light'");
		System.out.println("Do Collaborated with:T.O.P, Teddy, 1TYM, Taeyang, 2NE1");

	}
}
class TOP extends Artists//1.1
{
	String ArtistStageName=" T.O.P";
	String ArtistRealName="Choi Seung-hyun";

	{
		System.out.println("Do Stage Name:"+ArtistStageName);
		System.out.println("Do Real Name:"+ArtistRealName);
		System.out.println("Do Img:Img.jpg");
		System.out.println("Do Nationality:South Korean");
		System.out.println("Do Age:35");
		System.out.println("Do Date of Birth:November 4, 1987 ");
		System.out.println("Do Height:5.9");
		System.out.println("Do Education:Seoul Sincheon Elementary School,  Dankook University");
		System.out.println("Do Profession:He is a member of the BigBang, rapper, singer, songwriter, record producer and actor");
		System.out.println("Do First Solo:Turn It Up");
		System.out.println("Do Debut Album:?");
		System.out.println("Do Songs:'GD & TOP','Turn It Up','Doom Dada', 'Super Fly', 'Hallelujah', 'High High'");
		System.out.println("Do Acting Debut:He did a acting in ' I Am Sam' series in 2007 ,'Nineteen' movie in 2007 and'71: Into the Fire 'drama in 2010");		
		System.out.println("Do Collaborated with:G-Dragon,Taeyang");

	}
}
class DAESUNG extends Artists//1.1
{
	String ArtistStageName="Daesung and 'D-lite in Japan";
	String ArtistRealName="Kang Dae-sung ";

	{
		System.out.println("Do Stage Name:"+ArtistStageName);
		System.out.println("Do Real Name:"+ArtistRealName);
		System.out.println("Do Img:Img.jpg");
		System.out.println("Do Nationality:South Korean");
		System.out.println("Do Age:34");
		System.out.println("Do Date of Birth:April 26, 1989");
		System.out.println("Do Height:5.10");
		System.out.println("Do Education:Kyung Hee University, Gukje Cyber University");
		System.out.println("Do Profession:He is a member of the BigBang, singer");
		System.out.println("Do First Solo:Look at Me, Gwisoon");
		System.out.println("Do Debut Album:D'scove in 2013");
		System.out.println("Do Songs:'Wings','Baby Don't Cry','D'slove', 'Big Hit'");
		System.out.println("Do Acting Debut:He did a acting in 'Secret Queen Makers' web series in 2018 ,'Now, We Are Breaking Up' drama in 2021 and'Dokgo Rewind' web series in 2018");		
	}
}

class SEVENTEEN extends Bands //6
{
	public void Members()
	{
		String Member1="S.Coups";
		String Member2="Jeonghan";
		String Member3="Joshua";
		String Member4="Jun";
		String Member5="Hoshi";
		String Member6="Wonwoo";
		String Member7="Woozi";
		String Member8="DK";
		String Member9="Mingyu";
		String Member10="The8";
		String Member11="Seungkwan";
		String Member12="Vernon";
		String Member13="Dino";
		
		System.out.println("Member 1:"+Member1);
		System.out.println("Member 2:"+Member2);
		System.out.println("Member 3:"+Member3);
		System.out.println("Member 4:"+Member4);
		System.out.println("Member 5:"+Member5);
		System.out.println("Member 6:"+Member6);
		System.out.println("Member 7:"+Member7);
		System.out.println("Member 8:"+Member1);
		System.out.println("Member 9:"+Member2);
		System.out.println("Member 10:"+Member3);
		System.out.println("Member 11:"+Member4);
		System.out.println("Member 12:"+Member5);
		System.out.println("Member 13:"+Member6);
		

	}

	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Seventeen");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Originated In:"+OriginatedIn);
		System.out.println("Founder Company of Band:Pledis Entertainment");
		System.out.println("Company Website:https://www.pledis.co.kr");
		System.out.println("Logo of Company:img.png");
		System.out.println("Band Name:Seventeen");
		System.out.println("Logo of Band:img.png");
		System.out.println("Band Website:http://www.seventeen-17.com");
		System.out.println("No. of Members:13");
		System.out.println("Formed In:2015");
		System.out.println("Leader Of The Group:S.Coups");
		System.out.println("FandomName:Carat");
		System.out.println("Debut Day:May 26th,2015");
		System.out.println("Debut Album:17 carat");
		System.out.println("No. of Albums Released:4 studio albums,12 extented plays,1 Compilation album and 21 Singles");

	}
	

	public void Albums()//ref1.Albums();
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Seventeen's Albums");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Debut Album:17 carat");
		System.out.println("No. of Albums Released:4 studio albums,12 extented plays,1 Compilation album and 21 Singles");
		System.out.println("Album 1:Love & Letter");
		System.out.println("Album 2:Teen, Age");
		System.out.println("Album 3:An Ode");
		System.out.println("Album 4:Face the Sun");
		System.out.println("Extended Play 1:17 carat");
		System.out.println("Extended Play 2:Boys Be");
		System.out.println("Extended Play 3:Going Seventeen");
		System.out.println("Extended Play 4:All");
		System.out.println("Extended Play 5:You Make My Day");
		System.out.println("Extended Play 6:You Made My Dawn");
		System.out.println("Extended Play 7:Semicolon");
		System.out.println("Extended Play 8:Attaca");
		System.out.println("Extended Play 9:Heng:garæ ");
		System.out.println("Extended Play 10:Your Choice");
		System.out.println("Extended Play 11:FML");
		System.out.println("Extended Play 12:We Make You");
		System.out.println("Compilation 1=17 Hits");
		System.out.println("Single 1:Adore U");
		System.out.println("Single 2:Preety U");
		System.out.println("Single 3:Mansae");
		System.out.println("Single 4:Very Nice");
		System.out.println("Single 5:Boom Boom");
		System.out.println("Single 6:Don't Wanna Cry");
		System.out.println("Single 7:Clap");
		System.out.println("Single 8:Thanks");
		System.out.println("Single 9:Oh My!!");
		System.out.println("Single 10:Getting Closer");
		System.out.println("Single 11:Home");
		System.out.println("Single 12:Hit");
		System.out.println("Single 13:Fear(? : Fear)");
		System.out.println("Single 14:Home;run");
		System.out.println("Single 15:Rock with You");
		System.out.println("Single 16:Ready to Love");
		System.out.println("Single 17:Hot");
		System.out.println("Single 18:World");
		System.out.println("Single 19:Super");
		System.out.println("Single 20:F*ck My Life");
		System.out.println("Single 21:Darl+ing");
		System.out.println("====================================================================================================================");

	}
}

class TWICE extends Bands //7
{
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("TWICE");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Originated In:"+OriginatedIn);
		System.out.println("Founder Company of Band:JYP Entertainment");
		System.out.println("Company Website:https://www.jype.com");
		System.out.println("Logo of Company:img.png");
		System.out.println("Band Name:TWICE");
		System.out.println("Logo of Band:img.png");
		System.out.println("Band Website:https://twice.jype.com");
		System.out.println("No. of Members:9");
		System.out.println("Formed In:2015");
		System.out.println("Leader Of The Group:Jihyo");
		System.out.println("FandomName:Once");
		System.out.println("Debut Day:Oct 20th,2015");
		System.out.println("Debut Album:Twicetagram");
		System.out.println("No. of Albums Released:7 studio albums,13 extented plays,4 Compilation album and 21 Singles");

	}
	
	public void Members()
	{
		String Member1="Nayeon";
		String Member2="Jeongyeon";
		String Member3="Momo";
		String Member4="Suna";
		String Member5="Jihyo";
		String Member6="Mina";
		String Member7="Dahyun";
		String Member8="Chaeyoung";
		String Member9="Tzuyu";
		
		System.out.println("Member 1:"+Member1);
		System.out.println("Member 2:"+Member2);
		System.out.println("Member 3:"+Member3);
		System.out.println("Member 4:"+Member4);
		System.out.println("Member 5:"+Member5);
		System.out.println("Member 6:"+Member6);
		System.out.println("Member 7:"+Member7);
		System.out.println("Member 8:"+Member1);
		System.out.println("Member 9:"+Member2);
		
	}

	public void Albums()//ref1.Albums();
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("TWICE's Albums");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Debut Album:Twicetagram");
		System.out.println("No. of Albums Released:7 studio albums,13 extented plays,4 Compilation album and 21 Singles");
		System.out.println("Album 1:Twicetagram");
		System.out.println("Album 2:Eyes Wide Open");
		System.out.println("Album 3:Formula of Love: O+T=<3");
		System.out.println("Album 4:BDZ");
		System.out.println("Album 5:&Twice");
		System.out.println("Album 6:Perfect World");
		System.out.println("Album 7:Celebrate");
		System.out.println("Extended Play 1:The Story Begins ");
		System.out.println("Extended Play 2:Page Two ");
		System.out.println("Extended Play 3:Signal");
		System.out.println("Extended Play 4:Twicecoaster: Lane 1");
		System.out.println("Extended Play 5:Yes or Yes");
		System.out.println("Extended Play 6:What Is Love?");
		System.out.println("Extended Play 7:Fancy You");
		System.out.println("Extended Play 8:Feel Special");
		System.out.println("Extended Play 9:More & More");
		System.out.println("Extended Play 10:Between 1&2");
		System.out.println("Extended Play 11:Taste of Love");
		System.out.println("Extended Play 12:Ready to be");
		System.out.println("Extended Play 13:What's Twice?");
		System.out.println("Compilation 1=#Twice");
		System.out.println("Compilation 2=#Twice2");
		System.out.println("Compilation 3=#Twice3");
		System.out.println("Compilation 4=#Twice4");
		System.out.println("Collab with virtual group K/DA:?I'll Show You");
		System.out.println("====================================================================================================================");

	}
}

class REDVELVET extends Bands //8
{
	
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("RED VELVET");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Originated In:"+OriginatedIn);
		System.out.println("Founder Company of Band:SM Entertainment");
		System.out.println("Company Website:https://www.smentertainment.com");
		System.out.println("Logo of Company:img.png");
		System.out.println("Band Name:RED VELVET");
		System.out.println("Logo of Band:img.png");
		System.out.println("Band Website:https://redvelvet-jp.net");
		System.out.println("No. of Members:5");
		System.out.println("Formed In:2014");
		System.out.println("Leader Of The Group:Irene");
		System.out.println("FandomName:ReVelvu");
		System.out.println("Debut Day:Aug 1st,2014");
		System.out.println("Debut Album:Happiness");
		System.out.println("No. of Albums Released:3 studio albums,14 extented plays,1 Compilation album ,28 Singles and 7 Soundtracks");

	}

	public void Members()
	{
		String Member1="Irene";
		String Member2="Seulgi";
		String Member3="Wendy";
		String Member4="Joy";
		String Member5="Yeri";
		
		System.out.println("Member 1:"+Member1);
		System.out.println("Member 2:"+Member2);
		System.out.println("Member 3:"+Member3);
		System.out.println("Member 4:"+Member4);
		System.out.println("Member 5:"+Member5);
		
	}
	

	public void Albums()//ref1.Albums();
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("RED VELVET's Albums");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");

		String CollabWithEllieGoulding="Close To Me";
		System.out.println("Debut Album:Happiness");
		System.out.println("No. of Albums Released:3 studio albums,14 extented plays,1 Compilation album ,28 Singles and 7 Soundtracks");
		System.out.println("Album 1:The Red");
		System.out.println("Album 2:Perfect Velvet");
		System.out.println("Album 3:Bloom");
		System.out.println("Extended Play 1:Ice Cream Cake ");
		System.out.println("Extended Play 2:The Velvet");
		System.out.println("Extended Play 3:Russian Roulette");
		System.out.println("Extended Play 4:Rookie");
		System.out.println("Extended Play 5:The Red Summer");
		System.out.println("Extended Play 6:Summer Magic");
		System.out.println("Extended Play 7:RBB");
		System.out.println("Extended Play 8:The ReVe Festival: Day 1");
		System.out.println("Extended Play 9:The ReVe Festival: Day 2");
		System.out.println("Extended Play 10:Queendom");
		System.out.println("Extended Play 11:The ReVe Festival 2022 – Feel My Rhythm");
		System.out.println("Extended Play 12:The ReVe Festival 2022 – Birthday");
		System.out.println("Extended Play 13:#Cookie Jar");
		System.out.println("Extended Play 14:Sappy");
		System.out.println("Compilation 1:The ReVe Festival: Finale");
		System.out.println("Single 1:Happiness");
		System.out.println("Single 2:Be Natural");
		System.out.println("Single 3:Automatic");
		System.out.println("Single 4:Ice Cream Cake");
		System.out.println("Single 5:Dumb Dumb");
		System.out.println("Single 6:Wish Tree");
		System.out.println("Single 7:One of These Nights");
		System.out.println("Single 8:Russian Roulette");
		System.out.println("Single 9:Rookie");
		System.out.println("Single 10:Would U");
		System.out.println("Single 11:Red Flavor:");
		System.out.println("Single 12:Rebirth");
		System.out.println("Single 13:Peek-a-Boo");
		System.out.println("Single 14:Bad Boy");
		System.out.println("Single 15:Power Up");
		System.out.println("Single 16:RBB (Really Bad Boy)");
		System.out.println("Single 17:Close to Me");
		System.out.println("Single 18:Zimzalabim");
		System.out.println("Single 19:Umpah Umpah");
		System.out.println("Single 20:Psycho");
		System.out.println("Single 21:Queendom");
		System.out.println("Single 22:Feel My Rhythm");
		System.out.println("Single 23:");
		System.out.println("Single 24:Beautiful Christmas");
		System.out.println("Single 25:#Cookie Jar");
		System.out.println("Single 26:Sappy");
		System.out.println("Single 27:Sayonara");
		System.out.println("Single 28:Wildside");
		System.out.println("Collab with Ellie Goulding:Close To Me");
		System.out.println("====================================================================================================================");

	}
}

class GIRLSGENERATION extends Bands //9
{
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Girls' Generation");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Originated In:"+OriginatedIn);
		System.out.println("Founder Company of Band:SM Entertainment");
		System.out.println("Company Website:https://www.smentertainment.com");
		System.out.println("Logo of Company:img.png");
		System.out.println("Band Name:Girls' Generation");
		System.out.println("Logo of Band:img.png");
		System.out.println("Band Website:https://girls-generation.jp");
		System.out.println("No. of Members:8");
		System.out.println("Formed In:2007");
		System.out.println("Leader Of The Group:?");
		System.out.println("FandomName:SNSD");
		System.out.println("Debut Day:Aug 5th,2007");
		System.out.println("Debut Album:Into the New World");
		System.out.println("No. of Albums Released:10 studio albums,4 extented plays,2 Compilation album ,35 Singles and 2 Live Albums");

	}
	public void Members()
	{
		String Member1="Taeyeon";
		String Member2="Sunny";
		String Member3="Tiffany";
		String Member4="Hyoyeon";
		String Member5="Yuri";
		String Member6="Sooyoung";
		String Member7="Yoona";
		String Member8="Seohyun";
		System.out.println("Member 1:"+Member1);
		System.out.println("Member 2:"+Member2);
		System.out.println("Member 3:"+Member3);
		System.out.println("Member 4:"+Member4);
		System.out.println("Member 5:"+Member5);
		System.out.println("Member 6:"+Member6);
		System.out.println("Member 7:"+Member7);
		System.out.println("Member 8:"+Member8);
		
	}
	

	public void Albums()//ref1.Albums();
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Girls' Generation's Albums");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Debut Album:Into the New World");
		System.out.println("No. of Albums Released:10 studio albums,4 extented plays,2 Compilation album ,35 Singles and 2 Live Albums");
		System.out.println("Album 1:Girls' Generation ");
		System.out.println("Album 2:Oh!");
		System.out.println("Album 3:The Boys");
		System.out.println("Album 4:Love & Peace");
		System.out.println("Album 5:I Got a Boy");
		System.out.println("Album 6:Lion Heart");
		System.out.println("Album 7:Holiday Night");
		System.out.println("Album 8:Forever 1");
		System.out.println("Album 9:Girls' Generation Japanese Version");
		System.out.println("Album 10:Girls & Peace");
		System.out.println("Extended Play 1:Gee");
		System.out.println("Extended Play 2:Genie");
		System.out.println("Extended Play 3:Hoot");
		System.out.println("Extended Play 4:Mr.Mr.");
		System.out.println("Compilation 1=Best Selection Non Stop Mix");
		System.out.println("Compilation 2=The Best");
		System.out.println("Single 1:Into the New World");
		System.out.println("Single 2:Girls' Generation");
		System.out.println("Single 3:Kissing You");
		System.out.println("Single 4:Baby Baby");
		System.out.println("Single 5:Gee");
		System.out.println("Single 6:Genie");
		System.out.println("Single 7:Oh!!");
		System.out.println("Single 8:Run Devil Run");
		System.out.println("Single 9:Hoot");
		System.out.println("Single 10:The Boys");
		System.out.println("Single 11:Mr.Taxi");
		System.out.println("Single 12:Dancing Queen");
		System.out.println("Single 13:I got a Boy");
		System.out.println("Single 14:Mr.Mr.");
		System.out.println("Single 15:Party");
		System.out.println("Single 16:Lion Heart");
		System.out.println("Single 17:You Think");
		System.out.println("Single 18:Sailing (0805)");
		System.out.println("Single 19:All Night");
		System.out.println("Single 20:Holiday");
		System.out.println("Single 21:Genie Japanese Version");
		System.out.println("Single 22:Gee Japanese Version");
		System.out.println("Single 23:Mr. Taxi japanese Version");
		System.out.println("Single 24:Run Devil Run Japanese Version");
		System.out.println("Single 25:Paparazzi Japanese Version");
		System.out.println("Single 26:All My Love Is for You Japanese Version");
		System.out.println("Single 27:Oh! Japanese Version ");
		System.out.println("Single 28:Flower Power Japanese Version");
		System.out.println("Single 29:Love & Girls Japanese Version");
		System.out.println("Single 30:Galaxy Supernova japanese Version");
		System.out.println("Single 31:My Oh My Japanese Version");
		System.out.println("Single 32:Catch Me If You Can Japanese Version");
		System.out.println("Single 33:Catch Me If You Can");
		System.out.println("Single 34:The Boys English Version");
		System.out.println("Collab with 2PM:Cabi Song");
		System.out.println("====================================================================================================================");

	}
}

class TXT extends Bands //10
{
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Tommorow by Together-TXT");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Originated In:"+OriginatedIn);
		System.out.println("Founder Company of Band:Bighit Entertainment");
		System.out.println("Company Website:https://ibighit.com");
		System.out.println("Logo of Company:img.png");
		System.out.println("Band Name:Tommorow by Together-TXT");
		System.out.println("Logo of Band:img.png");
		System.out.println("Band Website:https://ibighit.com › txt");
		System.out.println("No. of Members:5");
		System.out.println("Formed In:2017");
		System.out.println("Leader Of The Group:Soobin");
		System.out.println("FandomName:MOA");
		System.out.println("Debut Day:March 4th,2019");
		System.out.println("Debut Album:The Dream Chapter: Star");
		System.out.println("No. of Albums Released:3 studio albums,6 extented plays,23 Singles");

	}

	public void Members()
	{
		String Member1="Yeonjun";
		String Member2="Soobin";
		String Member3="Taehyun";
		String Member4="Beomgyu";
		String Member5="HueningKai";
		System.out.println("Member 1:"+Member1);
		System.out.println("Member 2:"+Member2);
		System.out.println("Member 3:"+Member3);
		System.out.println("Member 4:"+Member4);
		System.out.println("Member 5:"+Member5);
		
	}

	public void Albums()//ref1.Albums();
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("TXT's Albums");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Debut Album:The Dream Chapter: Star");
		System.out.println("No. of Albums Released:3 studio albums,6 extented plays,23 Singles");
		System.out.println("Album 1:The Dream Chapter: Magic ");
		System.out.println("Album 2:Still Dreaming");
		System.out.println("Album 3:The Chaos Chapter: Freeze");
		System.out.println("Extended Play 1:The Dream Chapter: Star");
		System.out.println("Extended Play 2:The Dream Chapter: Eternity");
		System.out.println("Extended Play 3:Minisode1: Blue Hour");
		System.out.println("Extended Play 4:Chaotic Wonderland");
		System.out.println("Extended Play 5:Minisode 2: Thursday's Child");
		System.out.println("Extended Play 6:The Name Chapter: Temptation");
		System.out.println("Single 1:Crown");
		System.out.println("Single 2:Cat & Dog(English version)");
		System.out.println("Single 3:Our Summer(Acoustic mix)");
		System.out.println("Single 4:Drama");
		System.out.println("Single 5:9 and Three Quarters (Run Away)");
		System.out.println("Single 6:Blue Hour");
		System.out.println("Single 7:Can't You See Me?");
		System.out.println("Single 8:Everlasting Shine");
		System.out.println("Single 9:Your Light");
		System.out.println("Single 10:Goodbye Now");
		System.out.println("Single 11:Force");
		System.out.println("Single 12:Love Sight");
		System.out.println("Single 13:Magic");
		System.out.println("Single 14:0x1=Lovesong (I Know I Love You)");
		System.out.println("Single 15:Loser=Lover");
		System.out.println("Single 16:Eto");
		System.out.println("Single 17:Eyes");
		System.out.println("Single 18:Good Boy Gone Bad");
		System.out.println("Single 19:PS5");
		System.out.println("Single 20:Valley of Lies");
		System.out.println("Single 21:Ring");
		System.out.println("Single 22:Sugar Rush Ride");
		System.out.println("Single 23:Free Falling");
		System.out.println("Collab with iann dior:Valley of Lies");
		System.out.println("Collab With salam ilese and Alan Walker:PS5");
		System.out.println("Collab with Seori:0X1=Lovesong (I Know I Love You)");
		System.out.println("====================================================================================================================");
	}
}



