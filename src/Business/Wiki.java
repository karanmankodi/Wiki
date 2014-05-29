package Business;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Wiki {

	private ArrayList<String> articleList;
	private ArrayList<String> authorList;
	private ArrayList<String> dateList;
	private HashMap<String, String> map;
	//private Date currentDate;
	public static Wiki wiki;

	public Wiki() {
		if (articleList == null) {
			articleList = new ArrayList<>();
		}
		if (authorList == null) {
			authorList = new ArrayList<>();
		}
		if (dateList == null) {
			dateList = new ArrayList<>();
		}
		map = new HashMap<>();
		//currentDate = new Date();
	}

	public static Wiki Initialize() {
		if (wiki == null) {
			wiki = new Wiki();
		}
		return wiki;
	}

	public ArrayList<String> getArticles() {
		return articleList;
	}

	public void addArticle(String article) {
		articleList.add(article);
	}

	public ArrayList<String> getDates() {
		return dateList;
	}

	public void addDate(Date date) {
		authorList.add(date.toString());
	}

	public ArrayList<String> getAuthors() {
		return authorList;
	}

	public void addAuthor(String author) {
		authorList.add(author);
	}

	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(String a, String b) {
		map.put(a, b);
	}
}
