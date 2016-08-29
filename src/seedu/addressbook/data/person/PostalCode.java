package seedu.addressbook.data.person;

public class PostalCode {
	private boolean isPrivate;
	private String value;

	public PostalCode(String postalCode, boolean isPrivate) {
		this.isPrivate = isPrivate;
		this.value = postalCode;
	}

	@Override
	public String toString() {
		return "Postal code: " + value;
	}

	@Override
	public boolean equals(Object other) {
		return other == this // short circuit if same object
				|| (other instanceof PostalCode // instanceof handles nulls
						&& this.value.equals(((PostalCode) other).value)); // state
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
