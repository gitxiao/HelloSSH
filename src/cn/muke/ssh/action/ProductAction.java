package cn.muke.ssh.action;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.muke.ssh.domain.Product;
import cn.muke.ssh.service.ProductService;

/**
 * 商品action类
 * @author Cfrjkj
 *
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{

	/**
	 * 模型驱动使用的类
	 */
	private Product product = new Product();
	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		System.out.println("ProductAction getModel");
		return null;
	}

	/**
	 * struts和spring整合过程中按名称自动注入的业务类
	 */
	private ProductService productService;

	public void setProductService(ProductService productService) {
		System.out.println("ProductAction setProductService");
		this.productService = productService;
	}

	/**
	 * 保存商品的方法
	 */
	public String save(){
		System.out.println("ProductAction action 中的save");
		productService.save(product);
		return null;
	}
	
	
}
