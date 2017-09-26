import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 14:22 2017/9/24 0024
 */
public class SolrTest {
    @Test
    public void addDocument() throws Exception {
        //创建一连接
        SolrServer solrServer = new HttpSolrServer("http://192.168.175.133:8080/solr");
        //创建一个文档对象
        SolrInputDocument document = new SolrInputDocument();
        document.addField("id", "test001");
        document.addField("item_title", "测试商品2");
        document.addField("item_price", 54321);
        //把文档对象写入索引库
        solrServer.add(document);
        //提交
        solrServer.commit();
    }

    @Test
    public void deleteDocument() throws Exception {
        //创建一连接
        SolrServer solrServer = new HttpSolrServer("http://192.168.175.133:8080/solr");
        //solrServer.deleteById("test001");
        solrServer.deleteByQuery("*:*");
        solrServer.commit();
    }
}
