package seedu.addressbook.data.person;

public class Block {

	private boolean isPrivate;
	private String value;
	public static final String EXAMPLE = "123, some street";
	public static final String MESSAGE_BLOCK_CONSTRAINTS = "Block ";

	public Block(String block, boolean isPrivate) {
		this.isPrivate = isPrivate;
		this.value = block;
	}

	@Override
	public String toString() {
		return "Block: " + value + " ";
	}

	@Override
	public boolean equals(Object other) {
		return other == this // short circuit if same object
				|| (other instanceof Block // instanceof handles nulls
						&& this.value.equals(((Block) other).value)); // state
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
