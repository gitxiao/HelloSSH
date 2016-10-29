package cn.muke.ssh.dao;

import cn.muke.ssh.domain.Product;

/**
 * 商品管理的dao类
 * @author Cfrjkj
 *
 */
public class ProductDao {

	public void save(Product product){
		System.out.println("ProductDao dao中的保存方法");
		System.out.println("product.getName() = " + product.getPname());
		System.out.println("product.getPid() = " + product.getPid());
		System.out.println("product.getPrice() = " + product.getPrice());
	}
}
