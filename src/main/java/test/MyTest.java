package test;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Customer;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class MyTest {

	//Customer Name Validation Test
	@Test
	public void test1() throws IOException {

		try{
			URL url = new URL(TestConfig.URL+"customers");
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			String line = "";
			StringBuilder stringBuilder = new StringBuilder();

			while((line = bufferedReader.readLine()) !=null){
				stringBuilder.append(line);
			}

			Gson gson = new Gson();
			String json = stringBuilder.toString();
			List<Customer> customers = gson.fromJson(json, new TypeToken<List<Customer>>(){}.getType());
			Assert.assertEquals(customers.get(0).getCustomerName(), "Nguyen Van A");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//Customer Address Validation Test
	@Test
	public void test2() throws IOException {

		try{
			URL url = new URL(TestConfig.URL+"customers");
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			String line = "";
			StringBuilder stringBuilder = new StringBuilder();

			while((line = bufferedReader.readLine()) !=null){
				stringBuilder.append(line);
			}

			Gson gson = new Gson();
			String json = stringBuilder.toString();
			List<Customer> customers = gson.fromJson(json, new TypeToken<List<Customer>>(){}.getType());
			Assert.assertEquals(customers.get(0).getCustomerAddress(), "702 Nguyen Van Linh");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//Customer Phone Verification Test
	@Test
	public void test3() throws IOException {

		try{
			URL url = new URL(TestConfig.URL+"customers");
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			String line = "";
			StringBuilder stringBuilder = new StringBuilder();

			while((line = bufferedReader.readLine()) !=null){
				stringBuilder.append(line);
			}

			Gson gson = new Gson();
			String json = stringBuilder.toString();
			List<Customer> customers = gson.fromJson(json, new TypeToken<List<Customer>>(){}.getType());
			Assert.assertEquals(customers.get(0).getCustomerPhone(), "0912345678");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//username verification test
	@Test
	public void test4() throws IOException {

		try{
			URL url = new URL(TestConfig.URL+"customers");
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			String line = "";
			StringBuilder stringBuilder = new StringBuilder();

			while((line = bufferedReader.readLine()) !=null){
				stringBuilder.append(line);
			}

			Gson gson = new Gson();
			String json = stringBuilder.toString();
			List<Customer> customers = gson.fromJson(json, new TypeToken<List<Customer>>(){}.getType());
			Assert.assertEquals(customers.get(0).getUsername(), "Alex123");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//password verification test
	@Test
	public void test5() throws IOException {

		try{
			URL url = new URL(TestConfig.URL+"customers");
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			String line = "";
			StringBuilder stringBuilder = new StringBuilder();

			while((line = bufferedReader.readLine()) !=null){
				stringBuilder.append(line);
			}

			Gson gson = new Gson();
			String json = stringBuilder.toString();
			List<Customer> customers = gson.fromJson(json, new TypeToken<List<Customer>>(){}.getType());
			Assert.assertEquals(customers.get(0).getPassword(), "123");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//Service Verification Test
	@Test
	public void test6() throws IOException {

		try{
			URL url = new URL(TestConfig.URL+"customers");
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			String line = "";
			StringBuilder stringBuilder = new StringBuilder();

			while((line = bufferedReader.readLine()) !=null){
				stringBuilder.append(line);
			}

			Gson gson = new Gson();
			String json = stringBuilder.toString();
			List<Customer> customers = gson.fromJson(json, new TypeToken<List<Customer>>(){}.getType());
			Assert.assertEquals(customers.get(0).getService(), "General Banking");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//bookingTime verification test
	@Test
	public void test7() throws IOException {

		try{
			URL url = new URL(TestConfig.URL+"customers");
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			String line = "";
			StringBuilder stringBuilder = new StringBuilder();

			while((line = bufferedReader.readLine()) !=null){
				stringBuilder.append(line);
			}

			Gson gson = new Gson();
			String json = stringBuilder.toString();
			List<Customer> customers = gson.fromJson(json, new TypeToken<List<Customer>>(){}.getType());
			Assert.assertEquals(customers.get(0).getBookingTime(), "7:00");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}