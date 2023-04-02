/*@author 吴承顿
 * @version 1.0
 * 
 * 
 * 
 */
public class ChangeChar {
	public static void main(String[] args) {
		System.out.println("北京\t上海\t成都");
		System.out.println("北京\n上海\n成都");
		System.out.println("韩顺平教育\r北京");
		//t制表符，对齐
		//r回车
		//n换行
		System.out.println("韩顺平教育\r北京");
		System.out.println("作者\t书名\t价格\t销量\n曹雪芹\t红楼梦\t25\t1500");
		System.out.println("\n");
		System.out.println("作者\t书名\t价格\t销量\r曹雪芹\t红楼梦\t25\t1500");
	}
}