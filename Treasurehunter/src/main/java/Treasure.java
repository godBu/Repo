
public class Treasure {

	public int position = 8;
	public int totaldistance = 10;
	private String name;
	private int yaxis;
	private int xaxis;
	private static boolean found;

	public Treasure() {
		setName("");
		setXaxis(0);
		setYaxis(0);
		setFound(false);

	}

	public int getYaxis() {
		return yaxis;
	}

	public void setYaxis(int yaxis) {
		this.yaxis = yaxis;
	}

	public int getXaxis() {
		return xaxis;
	}

	public void setXaxis(int xaxis) {
		this.xaxis = xaxis;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static boolean isFound() {
		return found;
	}

	public void setFound(boolean found) {
		this.found = found;
	}

	public void hideTreasure() {
		xaxis = 1 + (int) (Math.random() * position);
		yaxis = 1 + (int) (Math.random() * position);

	}

	public int treasureStatus(int xStick, int yStick) {
		if ((xStick == xaxis && yStick == yaxis || found == true))
			return 0;

		else if (xStick != xaxis || yStick != yaxis) {
			return Math.abs((yStick - yaxis) + (xStick - xaxis));

		} else
			return totaldistance;
	}
}
