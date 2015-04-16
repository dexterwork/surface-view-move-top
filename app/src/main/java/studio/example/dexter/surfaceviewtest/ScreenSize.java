package studio.example.dexter.surfaceviewtest;

import android.app.Activity;
import android.util.DisplayMetrics;

/**
 * 
 * @author dexter
 *
 */
public class ScreenSize {

	
	private int screenWidth;
	private int screenHeight;

	public ScreenSize(Activity activity) {
		super();
		DisplayMetrics metrics = new DisplayMetrics();
		activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
		this.setScreenHeight(metrics.heightPixels);
		this.setScreenWidth(metrics.widthPixels);
	}

	public int getScreenWidth() {
		return screenWidth;
	}

	private void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	public int getScreenHeight() {
		return screenHeight;
	}

	private void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}

}
