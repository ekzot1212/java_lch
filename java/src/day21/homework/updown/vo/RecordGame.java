package day21.homework.updown.vo;

import java.util.Objects;

import lombok.Data;

@Data
public class RecordGame {

	private String id;
	private int count;
	
	public RecordGame(String id, int count) {
		this.id = id;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "[" + id + " : " + count + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecordGame other = (RecordGame) obj;
		return count == other.count;
	}

	@Override
	public int hashCode() {
		return Objects.hash(count);
	}
}