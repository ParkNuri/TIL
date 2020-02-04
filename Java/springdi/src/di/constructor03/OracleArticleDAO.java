package di.constructor03;

public class OracleArticleDAO implements IArticleDAO {

	@Override
	public void insert(ArticleDTO dto) {
		System.out.println("oracle insert");
	}

}
