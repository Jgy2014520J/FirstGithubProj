package chihuolianmeng;

import java.util.Scanner;

public class chihuolianmeng {

	    public static void main(String[] args) {
	        //����������������������� ��Ʒ��Ϣ  �Ͳ�ʱ��  �Ͳ͵�ַ  �Ͳ�״̬  �ܽ��
	        String [] dingDanRen = new String[4];//������
	        String [] canPinXinXi = new String[4];//��Ʒ��Ϣ
	        String [] songCanDiZhi = new String[4];// �Ͳ͵�ַ
	        int  [] songCanTimes = new int[4];//�Ͳ�ʱ��
	        int [] zhuangTai = new int[4];//�Ͳ�״̬ 0������� 1����Ԥ��
	        double [] sumPrice = new double[4];//�ܽ��
	         //�����Ϣ�������� ��Ʒ��Ϣ  �Ͳ�ʱ��  �Ͳ͵�ַ  �Ͳ�״̬  �ܽ��
	        dingDanRen[0] = "�ŷ�";
	        canPinXinXi[0] = "������x2��";
	        songCanDiZhi[0] = "�񺺴�Ӫ";
	        songCanTimes[0] = 12;
	        zhuangTai [0] = 0;
	        sumPrice[0] = 50.0;

	        dingDanRen[1] = "�ŷ�2";
	        canPinXinXi[1] = "���x2��";
	        songCanDiZhi[1] = "�񺺴�Ӫ";
	        songCanTimes[1] = 13;
	        zhuangTai [1] = 1;
	        sumPrice[1] = 360.0;

	        //����˵��� ���� ������
	        String [] caiDanM = new String[4];//�˵���
	        double [] danJia = new double[4];//����
	        int [] dianZan = new int[4];//������
	        //�����Ϣ���˵���  ����   ������
	        caiDanM[0] = "������";
	        danJia[0] = 25.0;
	        dianZan [0] = 0;

	        caiDanM[1] = "ţ��";
	        danJia[1] = 38.0;
	        dianZan[1] = 14;

	        caiDanM[2] = "���";
	        danJia[2] = 180.0;
	        dianZan[2] = 3;

	        //����scanner��������
	        Scanner input = new Scanner(System.in);
	        int choice = -1;//�ȴ���ѡ��ı���choice
	        do {
	            System.out.println("**************��ӭ�����Ի�����**************");
	            System.out.println("1.��Ҫ���");
	            System.out.println("2.�鿴�˴�");
	            System.out.println("3.ɾ������");
	            System.out.println("4.ǩ�ն���");
	            System.out.println("5.��Ҫ����");
	            System.out.println("6.�˳�����");
	            System.out.println("**************��ӭ����**************");
	            System.out.println("��ѡ��");
	             choice = input.nextInt();
	            switch (choice){
	                case    1:
	                    System.out.println("****��Ҫ���****");
	                    //����ҵĲ˴��Ƿ����ˣ�������˾Ͳ�����Ӷ�����û������Ӳ�
	                    boolean flag = false;
	                    int index = -1;//���������Ӳ˵�����
	                    for (int i = 0; i < dingDanRen.length; i++) {
	                        if (dingDanRen[i] == null){
	                            flag = true;//��ʾ�ҵĲ˴�û����������Ӳ�
	                            index = i;//��û�е�͵�λ�ø�index������index�������˵����
	                            break;//����ѭ��
	                        }
	                    }
	                    //��ʱflag��true
	                    if (flag) {
	                        //���ڿ�����Ӳ�Ʒ��Ϣ
	                        System.out.println("���\t��Ʒ��\t����\t������");
	                        for (int i = 0; i < caiDanM.length; i++) {//�����˵���
	                            if (caiDanM[i] != null) {//���˵������ֵ�ǲ��ǿ�
	                                System.out.println((i+1)+caiDanM[i]+"\t"+danJia[i]+"\t"+dianZan[i]);
	                            }
	                    }
	                        //���������Ϣ
	                        System.out.println("�����붩����������");
	                        String name = input.next();
	                        System.out.println("������˵���ţ�");
	                        int xuHao = input.nextInt();
	                        System.out.println("��������Ҫ�ķ�����");
	                        int fenShu = input.nextInt();
	                        System.out.println("�����붩��ʱ�䣨10-20�����Ͳ�)");
	                        int time = input.nextInt();
	                        if (time < 10 || time >20) {
	                            System.out.println("�������ʱ���������������룺");
	                            time = input.nextInt();
	                        }
	                        System.out.println("�������Ͳ͵�ַ��");
	                        String diZhi = input.next();
	                        //����ͷѺ�
	                        double total = danJia[xuHao-1]*fenShu;//danJia[xuhao-1]:�������һ����0�� ����������1����ʾ������ĵ�һ������
	                        //�������>=50Ԫ����ȥ�Ͳͷ�,С��50��6Ԫ�Ͳͷ�
	                        double songCanFei = total>=50?0.0:6.0;
	                        //�����ܷ���
	                        double zongCanFei = total + songCanFei;
	                        System.out.println("�����ͳɹ���");
	                        //������ϸ��Ϣ�Ӷ����˵��ܽ��
	                        System.out.println("������������ϸ��Ϣ��");
	                        System.out.println("�����ˣ�"+name);
	                        System.out.println("�������ǣ�"+caiDanM[xuHao-1]);
	                        System.out.println("��������Ҫ�ķ�����"+fenShu);
	                        System.out.println("�����붩��ʱ�䣨10-20�����Ͳͣ�"+time);
	                        System.out.println("�������Ͳ͵�ַ��"+diZhi);
	                        System.out.println("�ͷѣ�"+total+"�Ͳͷѣ�"+songCanFei);

	                        //����Ԥ���Ķ������ŵ�������
	                        dingDanRen[index] = name;
	                        canPinXinXi[index] = caiDanM[xuHao-1]+fenShu+"��";
	                        songCanTimes[index] = time;
	                        songCanDiZhi[index] = diZhi;
	                        sumPrice[index] = zongCanFei;
	                        zhuangTai[index] = 1;
	                    }else {
	                        System.out.println("���Ĳʹ���������������ˣ�");
	                    }
	                    break;
	                case    2:
	                    System.out.println("****�鿴�˴�****");
	                    System.out.println("���\t������\t\t��Ʒ��\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t�ܽ��\t״̬");
	                    for (int i = 0; i < dingDanRen.length; i++) {
	                        if (dingDanRen[i] != null) {
	                            String  newSongCanTime = songCanTimes[i]+"��";
	                            String newSongcanJinE = sumPrice[i]+"Ԫ";
	                            String newZhuangTai = zhuangTai[i]==0? "�����":"��Ԥ��";
	                            System.out.println((i+1)+"\t"+dingDanRen[i]+"\t"+canPinXinXi[i]+"\t"+newSongcanJinE+"\t"+songCanDiZhi[i]+"\t"+newSongcanJinE+"\t"+newZhuangTai);
	                        }

	                    }
	                    break;
	                case    3:
	                    System.out.println("****ɾ������****");
	                    System.out.println("������Ҫɾ���Ķ�������ţ�");
	                    int delDingDan = input.nextInt();
	                    //�ж���ɾ��������ڲ��ڷ�Χ�ڣ�����ڷ�Χ��
	                    if (delDingDan >= 1 && delDingDan<dingDanRen.length) {
	                        int delIndex = -1;//Ҫɾ����λ��
	                        for (int i = 0; i < dingDanRen.length; i++) {
	                            //1.����ķ�Χ
	                            if (dingDanRen[i] != null && zhuangTai[i]  == 0 && delDingDan-1 == i) {
	                                delIndex = i;
	                                break;
	                            }
	                            //2.������ķ�Χ
	                            if (dingDanRen[i] != null && zhuangTai[i] ==1 && delDingDan-1 == i) {
	                                System.out.println("����δǩ�գ�����ɾ����");
	                            }
	                        }

	                        //����ɾ������
	                        if (delIndex != -1) {
	                            for (int i = 0; i < dingDanRen.length; i++) {
	                                //ִ��ɾ��
	                                dingDanRen[i] = dingDanRen[i+1];
	                                canPinXinXi[i] = canPinXinXi[i+1];
	                                songCanTimes[i] = songCanTimes[i+1];
	                                songCanDiZhi[i] = songCanDiZhi[i+1];
	                                sumPrice[i] = sumPrice[i+1];
	                                zhuangTai[i] = zhuangTai[i+1];
	                            }
	                            //������һλ
	                            int lastIndex = dingDanRen.length-1;
	                            dingDanRen[lastIndex] = null;
	                            canPinXinXi[lastIndex] = null;
	                            songCanDiZhi[lastIndex]= null;
	                            songCanTimes[lastIndex] = 0;
	                            sumPrice[lastIndex] = 0.0;
	                            zhuangTai[lastIndex] =0;
	                            System.out.println("ɾ���ɹ���");
	                        }
	                    }else {
	                        System.out.println("���ڷ�Χ�ڣ�û���ҵ�������");
	                    }
	                    break;
	                case    4:
	                    System.out.println("****����ǩ��****");
	                    System.out.println("������Ҫǩ�յĶ�����ţ�");
	                    int qianShou = input.nextInt();
	                    boolean danHao = false;//��ǵ���
	                    for (int i = 0; i < dingDanRen.length; i++) {
	                        if (dingDanRen[i] != null && zhuangTai[i] == 0 && qianShou-1==i) {
	                            zhuangTai[i] = 1;
	                            System.out.println("����ǩ�ճɹ���");
	                            danHao = true;
	                        }else if (dingDanRen[i] != null && zhuangTai[i] ==1 && qianShou-1==i) {
	                            System.out.println("��ûǩ�գ������ٴ�ǩ�գ�");
	                            danHao = true;
	                        }
	                    }
	                    if (!danHao) {
	                        System.out.println("������ĵ��Ų����ڣ�");
	                    }
	                    break;
	                case    5:
	                    System.out.println("****��Ҫ����****");
	                    System.out.println("���\t��Ʒ��\t����\t������");
	                    for (int i = 0; i < dianZan.length; i++) {
	                        String money = danJia[i]+"Ԫ";
	                        String dianzanshu = dianZan[i]>0? dianZan[i]+"��":"";
	                        System.out.println(i+1+"\t"+caiDanM[i]+"\t"+money+"\t"+dianzanshu);
	                    }
	                    System.out.println("��������޵���ţ�");
	                    int dianZXHao = input.nextInt();
	                    dianZan[dianZXHao-1]++;
	                    System.out.println("���޳ɹ���");
	                    break;
	                case    6:
	                    System.out.println("****�˳�����****");
	                    break;
	            }
	            System.out.println("����0������һ�㣺");
	            choice = input.nextInt();
	        }while (choice == 0);
	        System.out.println("�������");
	    }
	}