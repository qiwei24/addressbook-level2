package seedu.addressbook.data.person;

public class Unit {
	private boolean isPrivate;
	private String value;
	public static final String EXAMPLE = "123, some street";
	public static final String MESSAGE_BLOCK_CONSTRAINTS = "Block ";

	public Unit(String unit, boolean isPrivate) {
		this.isPrivate = isPrivate;
		this.value = unit;
	}

	@Override
	public String toString() {
		return "Unit: " + value + " ";
	}

	@Override
	public boolean equals(Object other) {
		return other == this // short circuit if same object
				|| (other instanceof Unit // instanceof handles nulls
						&& this.value.equals(((Unit) other).value)); // state
																		// check
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}
}
