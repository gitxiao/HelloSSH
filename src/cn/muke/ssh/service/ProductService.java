package cn.muke.ssh.service;

import cn.muke.ssh.dao.ProductDao;
import cn.muke.ssh.domain.Product;

/**
 * ҵ���
 * @author Cfrjkj
 *
 */
public class ProductService {

	/**
	 * ҵ���ע���dao��
	 */
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	/**
	 * service�еı��淽��
	 */
	public void save(Product product){
		System.out.println("service�еı��淽��");
		productDao.save(product);
	}
}
