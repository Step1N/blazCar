package com.blazcar.washer.googlemap;

import com.blazcar.washer.integration.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoogleMapService {
	
	@Autowired
    HttpService httpService;
	
	/*@Value
	private String googleApiUrl;*/
	
	/*public String getVendorList(){
		String rawData = httpService.readUrl(strUrl);
	}*/
	/*public static void main(String[] args) {
			try {
				readUrl("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=12.9207533,77.7072302&radius=2000&types=travel_agency&key=AIzaSyDzhb2JFt-h8JhsFGuJFNK8dAf7dT9OQ2k");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public static String readUrl(String strUrl) throws IOException {
			String data = "";
			InputStream iStream = null;
			HttpURLConnection urlConnection = null;
			try {
				URL url = new URL(strUrl);

				// Creating an http connection to communicate with url
				urlConnection = (HttpURLConnection) url.openConnection();

				// Connecting to url
				urlConnection.connect();

				// Reading data from url
				iStream = urlConnection.getInputStream();

				BufferedReader br = new BufferedReader(new InputStreamReader(iStream));

				StringBuffer sb = new StringBuffer();

				String line = "";
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}

				data = sb.toString();
				System.out.println(data);
				br.close();

			} catch (Exception e) {

			} finally {
				iStream.close();
				urlConnection.disconnect();
			}
			return data;
		}*/

		/*private void ShowNearbyPlaces(List<HashMap<String, String>> nearbyPlacesList) {
		        for (int i = 0; i < nearbyPlacesList.size(); i++) {


		            HashMap<String, String> googlePlace = nearbyPlacesList.get(i);
		            double lat = Double.parseDouble(googlePlace.get("lat"));
		            double lng = Double.parseDouble(googlePlace.get("lng"));
		            String placeName = googlePlace.get("place_name");
		            String vicinity = googlePlace.get("vicinity");

		        }
		    }

		protected void onPostExecute(String result) {
		        List<HashMap<String, String>> nearbyPlacesList = null;
		        DataParser dataParser = new DataParser();
		        nearbyPlacesList =  dataParser.parse(result);
		        ShowNearbyPlaces(nearbyPlacesList);
		    }*/
	}
