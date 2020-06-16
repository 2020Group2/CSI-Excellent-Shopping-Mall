<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
    PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.chinasoft.dao.UserDao">
	
	
	<!-- User的结果集映射 -->
   <resultMap id="BaseResultMap" type="com.chinasoft.entity.User">
    <id column="user_id" jdbcType="INT" property="user_id" />
    <result column="name" jdbcType="VARCHAR" property="name" />
    <result column="password" jdbcType="VARCHAR" property="password" />
    <result column="profileImg" jdbcType="VARCHAR" property="profileImg" />
    <result column="phone" jdbcType="VARCHAR" property="phone" />
    <result column="email" jdbcType="VARCHAR" property="email" />
    <result column="gender" jdbcType="VARCHAR" property="gender" />
    <result column="enable_status" jdbcType="INT" property="enable_status" />
    <result column="create_time" jdbcType="DATETIME" property="create_time" />
    <result column="last_edit_time" jdbcType="DATETIME" property="last_edit_time" />
    <collection property="orderList" ofType="Order">
 				<result column="orderId" property="orderid"/>
 				<result column="ProductNumber" property="productNumber"/>
 				<result column="orderPrice" property="orderPrice"/>
 				<result column="orderDesc" property="orderDesc"/>
 				<result column="comments" property="comments"/>
 				<result column="enableStatus" property="enableStatus"/>
 				<result column="createTime" property="createTime"/>
 				<result column="lastEditTime" property="lastEditTime"/>
 				<result column="product" property="product"/>
 				<result column="user" property="user"/>
 	</collection>
 	 <collection property="userAddressList" ofType="UserAddress">
 				<result column="AddrId" property="addrid"/>
 				<result column="content" property="content"/>
 				<result column="priority" property="priority"/>
 				<result column="createTime" property="createTime"/>
 				<result column="lastEditTime" property="lastEditTime"/>
 				<result column="user_id" property="user_id"/>
 	</collection>
 	 <collection property="shopCarList" ofType="shopCar">
 				<result column="shopCarId" property="shopcarid"/>
 				<result column="description" property="description"/>
 				<result column="number" property="number"/>
 				<result column="shopCarPrice" property="shopCarPrice"/>
 				<result column="createTime" property="createTime"/>
 				<result column="lastEditTime" property="lastEditTime"/>
 				<result column="product" property="product"/>
 				<result column="user_id" property="user_id"/>
 	</collection>
 	<collection property="productCollectionList" ofType="ProductCollection">
 				<result column="collectionId" property="collectionid"/>
 				<result column="product" property="product"/>
				<result column="user" property="user"/> 				
				<result column="createTime" property="createTime"/>
 				<result column="lastEditTime" property="lastEditTime"/>	
 	</collection> 
  </resultMap>

	
	<!-- 登录功能 -->
	<select id="login" parameterType="String"  resultType="User">
		SELECT * FROM `user` WHERE name = #{name}
	</select>
	
	
	<!-- 注册功能 -->
	<insert id="InsertUserDynamic" parameterType="User">
		insert into user
		<trim prefix="(" suffix=")" suffixOverrides=",">
			<if test="user_id != null">user_id,</if>
			<if test="name != null">name,</if>
			<if test="password != null">password,</if>
			<if test="profileImg != null">profileImg,</if>
			<if test="phone != null">phone,</if>
			<if test="email != null">email,</if>
			<if test="gender != null">gender,</if>
			<if test="enable_status != null">enable_status,</if>
			<if test="create_time != null">create_time,</if>
			<if test="last_edit_time != null">last_edit_time,</if>
			<if test="userAddressList != null">userAddressList,</if>
			<if test="orderList != null">orderList,</if>
			<if test="productCollectionList != null">productCollectionList,</if>
			<if test="shopCarList != null">shopCarList,</if>
		</trim>

		<trim prefix="values (" suffix=")" suffixOverrides=",">
			<if test="user_id != null">#{user_id, jdbcType=INTEGER},</if>
			<if test="name != null">#{name, jdbcType=VARCHAR},</if>
			<if test="password != null">#{password, jdbcType=VARCHAR},</if>
			<if test="prifileImg != null">#{profileImg, jdbcType=VARCHAR},</if>
			<if test="phone != null">#{phone, jdbcType=VARCHAR},</if>
			<if test="email != null">#{email, jdbcType=VARCHAR},</if>
			<if test="gender != null">#{gender, jdbcType=VARCHAR},</if>
			<if test="enable_status != null">#{enable_status, jdbcType=INTEGER},</if>
			<if test="create_time != null">#{create_time, jdbcType=DATE},</if>
			<if test="last_edit_time != null">#{last_edit_time, jdbcType=DATE},</if>
		</trim>

	</insert>











	
	
	
	
</mapper>


