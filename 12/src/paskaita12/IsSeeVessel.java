package paskaita12;

public interface IsSeeVessel {
	void drive();
	default void bure() {
		System.out.println("didele bure");
	}
}
