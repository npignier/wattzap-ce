/* This file is part of Wattzap Community Edition.
 *
 * Wattzap Community Edtion is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Wattzap Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Wattzap.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.wattzap.model.dto;

import java.io.Serializable;

/**
 * Data object for telemetry coming from the ANT Speed, Cadence and Heart Rate
 * Sensors
 * 
 * @author David George (c) Copyright 2013
 * @date 19 June 2013
 */
public class Telemetry implements Serializable {
	private static final double KMTOMILES = 1.609344;

	private double speed;
	private int cadence;
	private double distance;
	private int power;
	private double elevation;
	private double gradient;
	private double latitude;
	private double longitude;
	private int heartRate;
	private long time;
	private int resistance;

	public Telemetry() {
		speed = -1;
		power = -1;
		latitude = 91;
		longitude = 181;
		heartRate = -1;

	}

	public Telemetry(Telemetry t) {
		speed = t.speed;
		cadence = t.cadence;
		distance = t.distance;
		power = t.power;
		elevation = t.elevation;
		gradient = t.gradient;
		latitude = t.latitude;
		longitude = t.longitude;
		heartRate = t.heartRate;
		time = t.time;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public int getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getElevation() {
		return elevation;
	}

	public void setElevation(double elevation) {
		this.elevation = elevation;
	}

	public double getGradient() {
		return gradient;
	}

	public void setGradient(double gradient) {
		this.gradient = gradient;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getSpeedKMH() {
		return speed;
	}

	public double getSpeedMPH() {
		return speed / KMTOMILES;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	/**
	 * Distance in meters
	 */
	public void setDistanceMeters(double distance) {
		this.distance = distance;
	}

	public double getDistanceMeters() {
		return distance;
	}

	public double getDistanceKM() {
		return distance / 1000;
	}

	public double getDistanceMiles() {
		return distance / (KMTOMILES * 1000);
	}

	public int getCadence() {
		return cadence;
	}

	// for player only mode
	public void setVirtualSpeed(double v) {
		cadence = (int) v;

	}

	public double getTrainerSpeed() {
		return cadence;
	}

	// for player only mode
	public void setResistance(int v) {
		resistance = v;

	}

	public int getResistance() {
		return resistance;
	}

	@Override
	public String toString() {
		return "Telemetry [speed=" + speed + ", cadence=" + cadence
				+ ", distance=" + distance + ", power=" + power
				+ ", elevation=" + elevation + ", gradient=" + gradient
				+ ", latitude=" + latitude + ", longitude=" + longitude
				+ ", heartRate=" + heartRate + " tt " + heartRate + ", time="
				+ time / 1000 + "]";
	}
}
