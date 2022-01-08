package org.lang;

public class StateDetails 
{
public void southIndia()
{
	System.out.println("south");
}
public void northIndia()
{
	System.out.println("north");
}
public static void main(String[] args) {
	StateDetails st=new StateDetails();
	st.southIndia();st.northIndia();
	LanguageInfo f=new LanguageInfo();
	f.englishLanguage();
	f.tamilLanguage();
	f.hindiLanguage();
	
}

}
