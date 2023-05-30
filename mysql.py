"""
利用pymysql第三方库操作数据库
1.创建数据库对象
DB=pymysql.connect(...)
2.利用数据库对象创建游标
C=DB.cursor()
3.利用游标对象操作数据库增删查改
C.execute("select * from tablename where ....")
C.execute("insert into tablename values(字段值，字段值，....)")
C.execute("insert into tablename (指定字段名，指定字段名，...) values(指定字段值，指定字段值，....)")
C.execute("update tablename set 字段1=值1，... where 条件")
C.execute("delete from tablename where 条件")
4.将操作提交到数据库 只针对写操作
DB.commit()
5.关闭游标
C.close()
6.断开数据库连接
DB.close()
介绍基本函数：
db=pymysql.connect(host="49.232.135.178",
                    port=3306,user="lyw",
                    password="li123456",
                    database="lyw",
                    charset="utf8")
db.commit() 提交写操作到数据库执行
db.rollback() 回滚 撤回上一步提交的写操作
cur=db.cursor() 返回游标对象 用于执行具体sql语句操作
db.close() 断开数据库连接
cur.execute("sql语句")
cur.close() 关闭游标对象
cur.fetchone() 获取一条查询记录
cur.fetchmany(n) 获取n条查询记录
cur.fetchall() 获取所有查询记录
"""
import pymysql

# 将字典添加到数据库lyw的表dict当中
if __name__=="__main__":
    DB = pymysql.connect(host="49.232.135.178",
                         port=3306,
                         user="lyw",
                         password="li135642",
                         database="lyw",
                         charset="utf8")
    C = DB.cursor()
    name = input("name=")
    age = input("age=")
    headimage = input("imagepath=")
    f=open(headimage,'rb')
    image=f.read()
    f.close()
    sql_select = "select * from students where headimage is null"
    sql_insert = "insert into students (name,age,headimage) values(%s,%s,%s)"
    # sql_update = "update students set headimage=%s where name='kkk'"
    # sql_delete = "delete from students where name='李彦伟'"
    try:
        C.execute(sql_insert,[name,age,image])
        DB.commit()
    except:
        DB.rollback()
        print("数据库写入操作出错")
        exit(0)
    C.execute(sql_select)
    lines = C.fetchall()
    for line in lines:
        for uint in line:
            print(uint,end=" ")
            # 将二进制数据库图片写入指定路径
            # f=open("lyw.jpg","bw")
            # f.write(uint)
            # f.close()
        print()
    C.close()
    DB.close()

