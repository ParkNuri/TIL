package di.constructor03;

public class MysqlArticleDAO implements IArticleDAO {

	@Override
	public void insert(ArticleDTO dto) {
		System.out.println("mysql insert");
	}

}
