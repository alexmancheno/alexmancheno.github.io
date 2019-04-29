public interface Flapping {
	public static final int DEFAULT_WING_BEATS = 30;
	public static final int DEFAULT_POPULATION = 10000;

	public int wingBeats();
	public boolean flaps();
}