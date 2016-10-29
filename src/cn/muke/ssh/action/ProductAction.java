package cn.muke.ssh.action;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.muke.ssh.domain.Product;
import cn.muke.ssh.service.ProductService;

/**
 * ��Ʒaction��
 * @author Cfrjkj
 *
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{

	/**
	 * ģ������ʹ�õ���
	 */
	private Product product = new Product();
	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		System.out.println("ProductAction getModel");
		return null;
	}

	/**
	 * struts��spring���Ϲ����а������Զ�ע���ҵ����
	 */
	private ProductService productService;

	public void setProductService(ProductService productService) {
		System.out.println("ProductAction setProductService");
		this.productService = productService;
	}

	/**
	 * ������Ʒ�ķ���
	 */
	public String save(){
		System.out.println("ProductAction action �е�save");
		productService.save(product);
		return null;
	}
	
	
}
