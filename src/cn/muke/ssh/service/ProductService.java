package cn.muke.ssh.service;

import cn.muke.ssh.dao.ProductDao;
import cn.muke.ssh.domain.Product;

/**
 * 业务层
 * @author Cfrjkj
 *
 */
public class ProductService {

	/**
	 * 业务层注入的dao类
	 */
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	/**
	 * service中的保存方法
	 */
	public void save(Product product){
		System.out.println("service中的保存方法");
		productDao.save(product);
	}
}
