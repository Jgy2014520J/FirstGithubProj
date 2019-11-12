package chihuolianmeng;

import java.util.Scanner;

public class chihuolianmeng {

	    public static void main(String[] args) {
	        //定义数据主体包括：订单人 餐品信息  送餐时间  送餐地址  送餐状态  总金额
	        String [] dingDanRen = new String[4];//订单人
	        String [] canPinXinXi = new String[4];//餐品信息
	        String [] songCanDiZhi = new String[4];// 送餐地址
	        int  [] songCanTimes = new int[4];//送餐时间
	        int [] zhuangTai = new int[4];//送餐状态 0：已完成 1；已预定
	        double [] sumPrice = new double[4];//总金额
	         //添加信息到订单人 餐品信息  送餐时间  送餐地址  送餐状态  总金额
	        dingDanRen[0] = "张飞";
	        canPinXinXi[0] = "烤羊腿x2份";
	        songCanDiZhi[0] = "蜀汉大营";
	        songCanTimes[0] = 12;
	        zhuangTai [0] = 0;
	        sumPrice[0] = 50.0;

	        dingDanRen[1] = "张飞2";
	        canPinXinXi[1] = "红酒x2份";
	        songCanDiZhi[1] = "蜀汉大营";
	        songCanTimes[1] = 13;
	        zhuangTai [1] = 1;
	        sumPrice[1] = 360.0;

	        //定义菜单名 单价 点赞数
	        String [] caiDanM = new String[4];//菜单名
	        double [] danJia = new double[4];//单价
	        int [] dianZan = new int[4];//点赞数
	        //添加信息到菜单名  单价   点赞数
	        caiDanM[0] = "烤羊腿";
	        danJia[0] = 25.0;
	        dianZan [0] = 0;

	        caiDanM[1] = "牛肉";
	        danJia[1] = 38.0;
	        dianZan[1] = 14;

	        caiDanM[2] = "红酒";
	        danJia[2] = 180.0;
	        dianZan[2] = 3;

	        //引入scanner键盘输入
	        Scanner input = new Scanner(System.in);
	        int choice = -1;//先创建选择的变量choice
	        do {
	            System.out.println("**************欢迎来到吃货联盟**************");
	            System.out.println("1.我要点餐");
	            System.out.println("2.查看菜袋");
	            System.out.println("3.删除订单");
	            System.out.println("4.签收订单");
	            System.out.println("5.我要点赞");
	            System.out.println("6.退出程序");
	            System.out.println("**************欢迎光临**************");
	            System.out.println("请选择：");
	             choice = input.nextInt();
	            switch (choice){
	                case    1:
	                    System.out.println("****我要点餐****");
	                    //标记我的菜袋是否满了，如果满了就不能添加东西，没满就添加菜
	                    boolean flag = false;
	                    int index = -1;//定义变量添加菜的索引
	                    for (int i = 0; i < dingDanRen.length; i++) {
	                        if (dingDanRen[i] == null){
	                            flag = true;//表示我的菜袋没有满可以添加菜
	                            index = i;//把没有点餐的位置给index，表明index现在有人点餐了
	                            break;//跳出循环
	                        }
	                    }
	                    //此时flag是true
	                    if (flag) {
	                        //现在可以添加菜品信息
	                        System.out.println("序号\t菜品名\t单价\t点赞数");
	                        for (int i = 0; i < caiDanM.length; i++) {//遍历菜单名
	                            if (caiDanM[i] != null) {//看菜单名里的值是不是空
	                                System.out.println((i+1)+caiDanM[i]+"\t"+danJia[i]+"\t"+dianZan[i]);
	                            }
	                    }
	                        //逐个订餐信息
	                        System.out.println("请输入订餐人姓名：");
	                        String name = input.next();
	                        System.out.println("请输入菜单序号：");
	                        int xuHao = input.nextInt();
	                        System.out.println("请输入需要的份数：");
	                        int fenShu = input.nextInt();
	                        System.out.println("请输入订单时间（10-20整点送餐)");
	                        int time = input.nextInt();
	                        if (time < 10 || time >20) {
	                            System.out.println("您输入的时间有误，请重新输入：");
	                            time = input.nextInt();
	                        }
	                        System.out.println("请输入送餐地址：");
	                        String diZhi = input.next();
	                        //计算餐费和
	                        double total = danJia[xuHao-1]*fenShu;//danJia[xuhao-1]:数组里第一个是0； 输入的序号是1，表示数组里的第一个单价
	                        //如果消费>=50元，免去送餐费,小于50收6元送餐费
	                        double songCanFei = total>=50?0.0:6.0;
	                        //计算总费用
	                        double zongCanFei = total + songCanFei;
	                        System.out.println("您订餐成功！");
	                        //输入详细信息从订单人到总金额
	                        System.out.println("以下是您的详细信息：");
	                        System.out.println("订餐人："+name);
	                        System.out.println("您定的是："+caiDanM[xuHao-1]);
	                        System.out.println("请输入需要的份数："+fenShu);
	                        System.out.println("请输入订单时间（10-20整点送餐："+time);
	                        System.out.println("请输入送餐地址："+diZhi);
	                        System.out.println("餐费："+total+"送餐费："+songCanFei);

	                        //把已预定的订单，放到数组里
	                        dingDanRen[index] = name;
	                        canPinXinXi[index] = caiDanM[xuHao-1]+fenShu+"份";
	                        songCanTimes[index] = time;
	                        songCanDiZhi[index] = diZhi;
	                        sumPrice[index] = zongCanFei;
	                        zhuangTai[index] = 1;
	                    }else {
	                        System.out.println("您的餐袋已满，不能添加了！");
	                    }
	                    break;
	                case    2:
	                    System.out.println("****查看菜袋****");
	                    System.out.println("序号\t订餐人\t\t餐品名\t送餐时间\t送餐地址\t总金额\t状态");
	                    for (int i = 0; i < dingDanRen.length; i++) {
	                        if (dingDanRen[i] != null) {
	                            String  newSongCanTime = songCanTimes[i]+"点";
	                            String newSongcanJinE = sumPrice[i]+"元";
	                            String newZhuangTai = zhuangTai[i]==0? "已完成":"已预定";
	                            System.out.println((i+1)+"\t"+dingDanRen[i]+"\t"+canPinXinXi[i]+"\t"+newSongcanJinE+"\t"+songCanDiZhi[i]+"\t"+newSongcanJinE+"\t"+newZhuangTai);
	                        }

	                    }
	                    break;
	                case    3:
	                    System.out.println("****删除订单****");
	                    System.out.println("请输入要删除的订单的序号：");
	                    int delDingDan = input.nextInt();
	                    //判断我删除的序号在不在范围内，如果在范围内
	                    if (delDingDan >= 1 && delDingDan<dingDanRen.length) {
	                        int delIndex = -1;//要删除的位置
	                        for (int i = 0; i < dingDanRen.length; i++) {
	                            //1.合理的范围
	                            if (dingDanRen[i] != null && zhuangTai[i]  == 0 && delDingDan-1 == i) {
	                                delIndex = i;
	                                break;
	                            }
	                            //2.不合理的范围
	                            if (dingDanRen[i] != null && zhuangTai[i] ==1 && delDingDan-1 == i) {
	                                System.out.println("订单未签收，不可删除！");
	                            }
	                        }

	                        //进行删除操作
	                        if (delIndex != -1) {
	                            for (int i = 0; i < dingDanRen.length; i++) {
	                                //执行删除
	                                dingDanRen[i] = dingDanRen[i+1];
	                                canPinXinXi[i] = canPinXinXi[i+1];
	                                songCanTimes[i] = songCanTimes[i+1];
	                                songCanDiZhi[i] = songCanDiZhi[i+1];
	                                sumPrice[i] = sumPrice[i+1];
	                                zhuangTai[i] = zhuangTai[i+1];
	                            }
	                            //清空最后一位
	                            int lastIndex = dingDanRen.length-1;
	                            dingDanRen[lastIndex] = null;
	                            canPinXinXi[lastIndex] = null;
	                            songCanDiZhi[lastIndex]= null;
	                            songCanTimes[lastIndex] = 0;
	                            sumPrice[lastIndex] = 0.0;
	                            zhuangTai[lastIndex] =0;
	                            System.out.println("删除成功！");
	                        }
	                    }else {
	                        System.out.println("不在范围内，没有找到订单！");
	                    }
	                    break;
	                case    4:
	                    System.out.println("****订单签收****");
	                    System.out.println("请输入要签收的订单序号：");
	                    int qianShou = input.nextInt();
	                    boolean danHao = false;//标记单号
	                    for (int i = 0; i < dingDanRen.length; i++) {
	                        if (dingDanRen[i] != null && zhuangTai[i] == 0 && qianShou-1==i) {
	                            zhuangTai[i] = 1;
	                            System.out.println("订单签收成功！");
	                            danHao = true;
	                        }else if (dingDanRen[i] != null && zhuangTai[i] ==1 && qianShou-1==i) {
	                            System.out.println("还没签收，不能再次签收！");
	                            danHao = true;
	                        }
	                    }
	                    if (!danHao) {
	                        System.out.println("您输入的单号不存在！");
	                    }
	                    break;
	                case    5:
	                    System.out.println("****我要点赞****");
	                    System.out.println("序号\t菜品名\t单价\t点赞数");
	                    for (int i = 0; i < dianZan.length; i++) {
	                        String money = danJia[i]+"元";
	                        String dianzanshu = dianZan[i]>0? dianZan[i]+"赞":"";
	                        System.out.println(i+1+"\t"+caiDanM[i]+"\t"+money+"\t"+dianzanshu);
	                    }
	                    System.out.println("请输入点赞的序号：");
	                    int dianZXHao = input.nextInt();
	                    dianZan[dianZXHao-1]++;
	                    System.out.println("点赞成功！");
	                    break;
	                case    6:
	                    System.out.println("****退出程序****");
	                    break;
	            }
	            System.out.println("输入0返回上一层：");
	            choice = input.nextInt();
	        }while (choice == 0);
	        System.out.println("程序结束");
	    }
	}