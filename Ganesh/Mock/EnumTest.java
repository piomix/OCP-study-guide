class EnumTest {
	enum Directions { North, East, West, South };
	enum Cards { Spade, Hearts, Club, Diamond };
	public static void main(String []args) {
		System.out.println("equals: " + Directions.East.equals(Cards.Hearts)); //false 
		System.out.println("ordinals: " +(Directions.East.ordinal() == Cards.Hearts.ordinal())); //true
	}
}