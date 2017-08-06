package com.fluently.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fluently.bean.Book;

public interface BookDao {
	/**
	 * ����ΪʲôҪ�������Ĳ������@Paramע���أ�����Ϊ�÷��������������ϵĲ�����һ��Ҫ�ӣ���Ȼmybatisʶ���ˡ�
	 * �����BookDao�ӿڵ�queryById������reduceNumber����ֻ��һ������book_id�����Կ��Բ��ü� @Paramע�⣬
	 * ��Ȼ����Ҳ����ν~
	 */

	/**
	 * ͨ��ID��ѯ����ͼ��
	 * 
	 * @param id
	 * @return
	 */
	Book queryById(long id);

	/**
	 * ��ѯ����ͼ��
	 * 
	 * @param offset
	 *            ��ѯ��ʼλ��
	 * @param limit
	 *            ��ѯ����
	 * @return
	 */
	List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * ���ٹݲ�����
	 * 
	 * @param bookId
	 * @return ���Ӱ����������>1����ʾ���µļ�¼����
	 */
	int reduceNumber(long bookId);
}
