package com.forecast.weather.model;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class Forecast {
	private double latitude;
	private double longitude;	
	private String timezone;
	private currently currently=new currently();
	private minutely minutely=new minutely();
	private hourly hourly=new hourly();
	private daily daily=new daily();
	private flags flags=new flags();
	private int offset;	
	public class currently{
		private int time;
		private String summary;
		private String icon;
		private int nearestStormDistance;
		private int nearestStormBearing;
		private double precipIntensity;
		private double precipProbability;
		private double temperature;
		private double apparentTemperature;
		private double dewPoint;
		private double humidity;
		private double pressure;
		private double windSpeed;
		private double windGust;
		private int windBearing;
		private double cloudCover;
		private int uvIndex;
		private double visibility;
		private double ozone;
		public int getTime() {
			return time;
		}
		public void setTime(int time) {
			this.time = time;
		}
		public String getSummary() {
			return summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
		public String getIcon() {
			return icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public int getNearestStormDistance() {
			return nearestStormDistance;
		}
		public void setNearestStormDistance(int nearestStormDistance) {
			this.nearestStormDistance = nearestStormDistance;
		}
		public int getNearestStormBearing() {
			return nearestStormBearing;
		}
		public void setNearestStormBearing(int nearestStormBearing) {
			this.nearestStormBearing = nearestStormBearing;
		}
		public double getPrecipIntensity() {
			return precipIntensity;
		}
		public void setPrecipIntensity(double precipIntensity) {
			this.precipIntensity = precipIntensity;
		}
		public double getPrecipProbability() {
			return precipProbability;
		}
		public void setPrecipProbability(double precipProbability) {
			this.precipProbability = precipProbability;
		}
		public double getTemperature() {
			return temperature;
		}
		public void setTemperature(double temperature) {
			this.temperature = temperature;
		}
		public double getApparentTemperature() {
			return apparentTemperature;
		}
		public void setApparentTemperature(double apparentTemperature) {
			this.apparentTemperature = apparentTemperature;
		}
		public double getDewPoint() {
			return dewPoint;
		}
		public void setDewPoint(double dewPoint) {
			this.dewPoint = dewPoint;
		}
		public double getHumidity() {
			return humidity;
		}
		public void setHumidity(double humidity) {
			this.humidity = humidity;
		}
		public double getPressure() {
			return pressure;
		}
		public void setPressure(double pressure) {
			this.pressure = pressure;
		}
		public double getWindSpeed() {
			return windSpeed;
		}
		public void setWindSpeed(double windSpeed) {
			this.windSpeed = windSpeed;
		}
		public double getWindGust() {
			return windGust;
		}
		public void setWindGust(double windGust) {
			this.windGust = windGust;
		}
		public int getWindBearing() {
			return windBearing;
		}
		public void setWindBearing(int windBearing) {
			this.windBearing = windBearing;
		}
		public double getCloudCover() {
			return cloudCover;
		}
		public void setCloudCover(double cloudCover) {
			this.cloudCover = cloudCover;
		}
		public int getUvIndex() {
			return uvIndex;
		}
		public void setUvIndex(int uvIndex) {
			this.uvIndex = uvIndex;
		}
		public double getVisibility() {
			return visibility;
		}
		public void setVisibility(double visibility) {
			this.visibility = visibility;
		}
		public double getOzone() {
			return ozone;
		}
		public void setOzone(double ozone) {
			this.ozone = ozone;
		}		
	}
	public class minutely{
		private String summary;
		private String icon;
		private ArrayList<data> data=new ArrayList<data>();
		public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public ArrayList<data> getData() {
			return data;
		}

		public void setData(ArrayList<data> data) {
			this.data = data;
		}

		public class data{
			private long time;
			private double precipIntensity;
			private double precipProbability;
			private String precipType;
			private double Error;
			public long getTime() {
				return time;
			}
			public void setTime(long time) {
				this.time = time;
			}
			public double getPrecipIntensity() {
				return precipIntensity;
			}
			public void setPrecipIntensity(double precipIntensity) {
				this.precipIntensity = precipIntensity;
			}
			public double getPrecipProbability() {
				return precipProbability;
			}
			public void setPrecipProbability(double precipProbability) {
				this.precipProbability = precipProbability;
			}
			public String getPrecipType() {
				return precipType;
			}
			public void setPrecipType(String precipType) {
				this.precipType = precipType;
			}
			public double getError() {
				return Error;
			}
			public void setError(double error) {
				Error = error;
			}
		}
	}
	public class hourly{
		private String summary;
		private String icon;
		private ArrayList<data> data=new ArrayList<data>();
		
		public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public ArrayList<data> getData() {
			return data;
		}

		public void setData(ArrayList<data> data) {
			this.data = data;
		}

		public class data{
			private long time;
			private String summary;
			private String icon;
			private double precipIntensity;
			private double precipProbability;
			private String precipType;
			private double temperature;
			private double apparentTemperature;
			private double dewPoint;
			private double humidity;
			private double pressure;
			private double windSpeed;
			private double windGust;
			private double windBearing;
			private double cloudCover;
			private int uvIndex;
			private double visibility;
			private double ozone;
			public long getTime() {
				return time;
			}
			public void setTime(long time) {
				this.time = time;
			}
			public String getSummary() {
				return summary;
			}
			public void setSummary(String summary) {
				this.summary = summary;
			}
			public String getIcon() {
				return icon;
			}
			public void setIcon(String icon) {
				this.icon = icon;
			}
			public double getPrecipIntensity() {
				return precipIntensity;
			}
			public void setPrecipIntensity(double precipIntensity) {
				this.precipIntensity = precipIntensity;
			}
			public double getPrecipProbability() {
				return precipProbability;
			}
			public void setPrecipProbability(double precipProbability) {
				this.precipProbability = precipProbability;
			}
			public String getPrecipType() {
				return precipType;
			}
			public void setPrecipType(String precipType) {
				this.precipType = precipType;
			}
			public double getTemperature() {
				return temperature;
			}
			public void setTemperature(double temperature) {
				this.temperature = temperature;
			}
			public double getApparentTemperature() {
				return apparentTemperature;
			}
			public void setApparentTemperature(double apparentTemperature) {
				this.apparentTemperature = apparentTemperature;
			}
			public double getDewPoint() {
				return dewPoint;
			}
			public void setDewPoint(double dewPoint) {
				this.dewPoint = dewPoint;
			}
			public double getHumidity() {
				return humidity;
			}
			public void setHumidity(double humidity) {
				this.humidity = humidity;
			}
			public double getPressure() {
				return pressure;
			}
			public void setPressure(double pressure) {
				this.pressure = pressure;
			}
			public double getWindSpeed() {
				return windSpeed;
			}
			public void setWindSpeed(double windSpeed) {
				this.windSpeed = windSpeed;
			}
			public double getWindGust() {
				return windGust;
			}
			public void setWindGust(double windGust) {
				this.windGust = windGust;
			}
			public double getWindBearing() {
				return windBearing;
			}
			public void setWindBearing(double windBearing) {
				this.windBearing = windBearing;
			}
			public double getCloudCover() {
				return cloudCover;
			}
			public void setCloudCover(double cloudCover) {
				this.cloudCover = cloudCover;
			}
			public int getUvIndex() {
				return uvIndex;
			}
			public void setUvIndex(int uvIndex) {
				this.uvIndex = uvIndex;
			}
			public double getVisibility() {
				return visibility;
			}
			public void setVisibility(double visibility) {
				this.visibility = visibility;
			}
			public double getOzone() {
				return ozone;
			}
			public void setOzone(double ozone) {
				this.ozone = ozone;
			}
		}
	}
	public class daily{
		private String summary;
		private String icon;
		private ArrayList<data> data=new ArrayList<data>();
		
		public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public ArrayList<data> getData() {
			return data;
		}

		public void setData(ArrayList<data> data) {
			this.data = data;
		}
		public class data{
			private long time;
			private String summary;
			private String icon;
			private long sunriseTime;
			private long sunsetTime;
			private double moonPhase;
			private double precipIntensity;
			private double precipIntensityMax;
			private long precipIntensityMaxTime;
			private double precipProbability;
			private String precipType;
			private double temperatureHigh;
			private long temperatureHighTime;
			private double temperatureLow;
			private long temperatureLowTime;
			private double apparentTemperatureHigh;
			private long apparentTemperatureHighTime;
			private double apparentTemperatureLow;
			private long apparentTemperatureLowTime;
			private double dewPoint;
			private double humidity;
			private double pressure;
			private double windSpeed;
			private double windGust;
			private long windGustTime;
			private double windBearing;
			private double cloudCover;
			private int uvIndex;
			private long uvIndexTime;
			private double visibility;
			private double ozone;
			private double temperatureMin;
			private long temperatureMinTime;
			private double temperatureMax;
			private long temperatureMaxTime;
			private double apparentTemperatureMin;
			private long apparentTemperatureMinTime;
			private double apparentTemperatureMax;
			private long apparentTemperatureMaxTime;
			public long getTime() {
				return time;
			}
			public void setTime(long time) {
				this.time = time;
			}
			public String getSummary() {
				return summary;
			}
			public void setSummary(String summary) {
				this.summary = summary;
			}
			public String getIcon() {
				return icon;
			}
			public void setIcon(String icon) {
				this.icon = icon;
			}
			public long getSunriseTime() {
				return sunriseTime;
			}
			public void setSunriseTime(long sunriseTime) {
				this.sunriseTime = sunriseTime;
			}
			public long getSunsetTime() {
				return sunsetTime;
			}
			public void setSunsetTime(long sunsetTime) {
				this.sunsetTime = sunsetTime;
			}
			public double getMoonPhase() {
				return moonPhase;
			}
			public void setMoonPhase(double moonPhase) {
				this.moonPhase = moonPhase;
			}
			public double getPrecipIntensity() {
				return precipIntensity;
			}
			public void setPrecipIntensity(double precipIntensity) {
				this.precipIntensity = precipIntensity;
			}
			public double getPrecipIntensityMax() {
				return precipIntensityMax;
			}
			public void setPrecipIntensityMax(double precipIntensityMax) {
				this.precipIntensityMax = precipIntensityMax;
			}
			public long getPrecipIntensityMaxTime() {
				return precipIntensityMaxTime;
			}
			public void setPrecipIntensityMaxTime(long precipIntensityMaxTime) {
				this.precipIntensityMaxTime = precipIntensityMaxTime;
			}
			public double getPrecipProbability() {
				return precipProbability;
			}
			public void setPrecipProbability(double precipProbability) {
				this.precipProbability = precipProbability;
			}
			public String getPrecipType() {
				return precipType;
			}
			public void setPrecipType(String precipType) {
				this.precipType = precipType;
			}
			public double getTemperatureHigh() {
				return temperatureHigh;
			}
			public void setTemperatureHigh(double temperatureHigh) {
				this.temperatureHigh = temperatureHigh;
			}
			public long getTemperatureHighTime() {
				return temperatureHighTime;
			}
			public void setTemperatureHighTime(long temperatureHighTime) {
				this.temperatureHighTime = temperatureHighTime;
			}
			public double getTemperatureLow() {
				return temperatureLow;
			}
			public void setTemperatureLow(double temperatureLow) {
				this.temperatureLow = temperatureLow;
			}
			public long getTemperatureLowTime() {
				return temperatureLowTime;
			}
			public void setTemperatureLowTime(long temperatureLowTime) {
				this.temperatureLowTime = temperatureLowTime;
			}
			public double getApparentTemperatureHigh() {
				return apparentTemperatureHigh;
			}
			public void setApparentTemperatureHigh(double apparentTemperatureHigh) {
				this.apparentTemperatureHigh = apparentTemperatureHigh;
			}
			public long getApparentTemperatureHighTime() {
				return apparentTemperatureHighTime;
			}
			public void setApparentTemperatureHighTime(long apparentTemperatureHighTime) {
				this.apparentTemperatureHighTime = apparentTemperatureHighTime;
			}
			public double getApparentTemperatureLow() {
				return apparentTemperatureLow;
			}
			public void setApparentTemperatureLow(double apparentTemperatureLow) {
				this.apparentTemperatureLow = apparentTemperatureLow;
			}
			public long getApparentTemperatureLowTime() {
				return apparentTemperatureLowTime;
			}
			public void setApparentTemperatureLowTime(long apparentTemperatureLowTime) {
				this.apparentTemperatureLowTime = apparentTemperatureLowTime;
			}
			public double getDewPoint() {
				return dewPoint;
			}
			public void setDewPoint(double dewPoint) {
				this.dewPoint = dewPoint;
			}
			public double getHumidity() {
				return humidity;
			}
			public void setHumidity(double humidity) {
				this.humidity = humidity;
			}
			public double getPressure() {
				return pressure;
			}
			public void setPressure(double pressure) {
				this.pressure = pressure;
			}
			public double getWindSpeed() {
				return windSpeed;
			}
			public void setWindSpeed(double windSpeed) {
				this.windSpeed = windSpeed;
			}
			public double getWindGust() {
				return windGust;
			}
			public void setWindGust(double windGust) {
				this.windGust = windGust;
			}
			public long getWindGustTime() {
				return windGustTime;
			}
			public void setWindGustTime(long windGustTime) {
				this.windGustTime = windGustTime;
			}
			public double getWindBearing() {
				return windBearing;
			}
			public void setWindBearing(double windBearing) {
				this.windBearing = windBearing;
			}
			public double getCloudCover() {
				return cloudCover;
			}
			public void setCloudCover(double cloudCover) {
				this.cloudCover = cloudCover;
			}
			public int getUvIndex() {
				return uvIndex;
			}
			public void setUvIndex(int uvIndex) {
				this.uvIndex = uvIndex;
			}
			public long getUvIndexTime() {
				return uvIndexTime;
			}
			public void setUvIndexTime(long uvIndexTime) {
				this.uvIndexTime = uvIndexTime;
			}
			public double getVisibility() {
				return visibility;
			}
			public void setVisibility(double visibility) {
				this.visibility = visibility;
			}
			public double getOzone() {
				return ozone;
			}
			public void setOzone(double ozone) {
				this.ozone = ozone;
			}
			public double getTemperatureMin() {
				return temperatureMin;
			}
			public void setTemperatureMin(double temperatureMin) {
				this.temperatureMin = temperatureMin;
			}
			public long getTemperatureMinTime() {
				return temperatureMinTime;
			}
			public void setTemperatureMinTime(long temperatureMinTime) {
				this.temperatureMinTime = temperatureMinTime;
			}
			public double getTemperatureMax() {
				return temperatureMax;
			}
			public void setTemperatureMax(double temperatureMax) {
				this.temperatureMax = temperatureMax;
			}
			public long getTemperatureMaxTime() {
				return temperatureMaxTime;
			}
			public void setTemperatureMaxTime(long temperatureMaxTime) {
				this.temperatureMaxTime = temperatureMaxTime;
			}
			public double getApparentTemperatureMin() {
				return apparentTemperatureMin;
			}
			public void setApparentTemperatureMin(double apparentTemperatureMin) {
				this.apparentTemperatureMin = apparentTemperatureMin;
			}
			public long getApparentTemperatureMinTime() {
				return apparentTemperatureMinTime;
			}
			public void setApparentTemperatureMinTime(long apparentTemperatureMinTime) {
				this.apparentTemperatureMinTime = apparentTemperatureMinTime;
			}
			public double getApparentTemperatureMax() {
				return apparentTemperatureMax;
			}
			public void setApparentTemperatureMax(double apparentTemperatureMax) {
				this.apparentTemperatureMax = apparentTemperatureMax;
			}
			public long getApparentTemperatureMaxTime() {
				return apparentTemperatureMaxTime;
			}
			public void setApparentTemperatureMaxTime(long apparentTemperatureMaxTime) {
				this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
			}
		}
	}
	public class flags{
		private ArrayList<String> sources=new ArrayList<String>();
		@SerializedName("nearest-station")
		private double nearest_station;
		private String units;
		public ArrayList<String> getSources() {
			return sources;
		}
		public void setSources(ArrayList<String> sources) {
			this.sources = sources;
		}
		public double getNearest_station() {
			return nearest_station;
		}
		public void setNearest_station(double nearest_station) {
			this.nearest_station = nearest_station;
		}
		public String getUnits() {
			return units;
		}
		public void setUnits(String units) {
			this.units = units;
		}
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
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public currently getCurrently() {
		return currently;
	}
	public void setCurrently(currently currently) {
		this.currently = currently;
	}	
	
	public minutely getMinutely() {
		return minutely;
	}
	public void setMinutely(minutely minutely) {
		this.minutely = minutely;
	}
	public hourly getHourly() {
		return hourly;
	}
	public void setHourly(hourly hourly) {
		this.hourly = hourly;
	}
	public daily getDaily() {
		return daily;
	}
	public void setDaily(daily daily) {
		this.daily = daily;
	}
	public flags getFlags() {
		return flags;
	}
	public void setFlags(flags flags) {
		this.flags = flags;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
}
