package basic;

public enum EnumTuna {
	Yinghui("Nice", 18), Tierney("Almost Nice?", 21);

	private final String desc;
	private final String year;

	// constructor
	EnumTuna(String description, String birthday) {
		desc = description;
		year = birthday;
	}

	public String getDesc() {
		return desc;
	}

	public String getYear() {
		return year;
	}

	/**
	 * 
	 * @param args
	 * 
	 *            public static void main(String[] args) { for (tuna people :
	 *            tuna.values()) System.out.println(people, people.); }
	 */
}
