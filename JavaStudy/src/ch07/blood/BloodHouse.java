package ch07.blood;

public class BloodHouse {
	public boolean isPossible(Human human) {
		 int age = 0; // ÇåÇ÷ÀÚÀÇ ³ªÀÌ¸¦ È®ÀÎÇÏ¿© ÀúÀå
		 
		 boolean isPossible = false;
		 // ÇåÇ÷ °¡´É ¿©ºÎ
		 /* ³Ñ°Ü¹ŞÀº Human Å¬·¡½º·ÎºÎÅÍ age Á¤º¸ È®ÀÎ age = ? */
		 /* age°¡ 16¼¼ ÀÌ»ó 69¼¼ ÀÌÇÏ ÀÏ¶§¸¸ ÇåÇ÷ °¡´ÉÇÏµµ·Ï Á¶°Ç¹® ÀÛ¼º */
		 age = human.getAge();
		 if(age >= 16 && age <=69) {
			 isPossible = true;
		 }		
		 return isPossible;
		 }
		 
		 public String action(Human human) {
		 String result = ""; // ÇåÇ÷ °á°ú ÀúÀå
		 String name = "";
		 name = human.getName();
		 /* isPossible() ¸Ş¼Òµå¸¦ È°¿ëÇÏ¿© ÇåÇ÷ °¡´É ¿©ºÎ¸¦ È®ÀÎÇÏ´Â Á¶°Ç¹® ÀÛ¼º */
		
		
		 /* ÇåÇ÷ °¡´É ½Ã result = "ÇåÇ÷ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù. XX´Ô °¨»çÇÕ´Ï´Ù. */
		 if(isPossible(human) == true ) {
			result = "ÇåÇ÷ÀÌ °¡´ÉÇÕ´Ï´Ù. "+ name +"´Ô °¨»çÇÕ´Ï´Ù.";
		 
		 /* ÇåÇ÷ ºÒ°¡ ½Ã result = "ÇåÇ÷ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù. */
		 }else {
			result = name +"´Ô ÇåÇ÷ÀÌ ºÒ°¡´É ÇÕ´Ï´Ù.";
		 }
		 return result;
		 }
}
