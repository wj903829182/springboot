package com.jack.responsibilitychain;

/**
 * Created by jack on 2017/8/7.
 */
public abstract class Handler {
    /**
     * 定义常量
     */
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    /**
     * 能处理的级别
     */
    private int level = 0;
    /**
     * 责任传递，下一个人责任人是谁
     */
    private Handler nextHandler;
    public Handler(int level) {
        this.level = level;
    }

    /**
     * 一个女性要求逛街或吃饭，你需要处理这个请求
     * @param women
     */
    public final void HandleMessage(IWomen women){
        if (this.level == women.getType()) {
            this.response(women);
        }else {
            //有后续环节才把请求往后传递
            if (this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            }else {//已经没有后续处理人了，不用处理了
                System.out.println("--没地方请示了，按不同意处理\n--");
            }
        }

    }

    /**
     * 如果不属于你处理的请求，你应该让她找下一个环节的人，如果女儿出嫁了，
     * 还向父亲请示能否逛街，那父亲应该告诉女儿，应该找丈夫请示
     * @param handler
     */
    public void setNext(Handler handler){
        this.nextHandler = handler;
    }

    /**
     * 有请示还需要回应，该方法就是表示回应
     * @param women
     */
    public abstract void response(IWomen women);

}
