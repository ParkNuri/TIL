package di.constructor03;

public class WriteArticleMgr implements IWriteArticleMgr {

	private IArticleDAO articleDAO;
	public WriteArticleMgr(IArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}
	
	@Override
	public void write(ArticleDTO article) {
		articleDAO.insert(article);
		}

}
