package p039e5;

import android.net.Network;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import p018c0.C0341k;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.C3377t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.pn */
/* loaded from: classes.dex */
public final class C1188pn extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public List f6909i;

    /* renamed from: j */
    public C3377t f6910j;

    /* renamed from: k */
    public C3377t f6911k;

    /* renamed from: l */
    public long f6912l;

    /* renamed from: m */
    public int f6913m;

    /* renamed from: n */
    public /* synthetic */ Object f6914n;

    /* renamed from: o */
    public final /* synthetic */ C1219qn f6915o;

    /* renamed from: p */
    public final /* synthetic */ String f6916p;

    /* renamed from: q */
    public final /* synthetic */ int f6917q;

    /* renamed from: r */
    public final /* synthetic */ int f6918r;

    /* renamed from: s */
    public final /* synthetic */ int f6919s;

    /* renamed from: t */
    public final /* synthetic */ int f6920t;

    /* renamed from: u */
    public final /* synthetic */ int f6921u;

    /* renamed from: v */
    public final /* synthetic */ int f6922v;

    /* renamed from: w */
    public final /* synthetic */ int f6923w;

    /* renamed from: x */
    public final /* synthetic */ String f6924x;

    /* renamed from: y */
    public final /* synthetic */ Network f6925y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188pn(C1219qn c1219qn, String str, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String str2, Network network, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f6915o = c1219qn;
        this.f6916p = str;
        this.f6917q = i7;
        this.f6918r = i8;
        this.f6919s = i9;
        this.f6920t = i10;
        this.f6921u = i11;
        this.f6922v = i12;
        this.f6923w = i13;
        this.f6924x = str2;
        this.f6925y = network;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1188pn) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1188pn c1188pn = new C1188pn(this.f6915o, this.f6916p, this.f6917q, this.f6918r, this.f6919s, this.f6920t, this.f6921u, this.f6922v, this.f6923w, this.f6924x, this.f6925y, interfaceC2313c);
        c1188pn.f6914n = obj;
        return c1188pn;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|2|(1:(1:(1:(14:7|8|9|10|11|(6:14|15|16|18|19|12)|23|24|30b|32|(1:34)(4:39|(1:41)(1:44)|42|43)|35|36|37)(2:93|94))(15:95|96|97|98|99|100|(4:102|103|104|105)(1:147)|106|107|(1:138)(1:111)|112|(1:114)|120|121|(6:123|124|125|126|(7:129|10|11|(1:12)|23|24|30b)|128)(6:137|11|(1:12)|23|24|30b)))(4:158|159|160|161))(12:203|88|208|209|210|(4:226|227|(1:229)(1:234)|(11:233|165|166|(2:184|185)|168|169|170|(1:172)|179|180|181))|212|213|214|215|(1:217)|128)|162|163|164|165|166|(0)|168|169|170|(0)|179|180|181|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01c2, code lost:
    
        if (p032d6.AbstractC0525d0.m1130h(r29, r58) != r7) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0373, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0374, code lost:
    
        r9 = r38;
        r14 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x036a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x036b, code lost:
    
        r18 = "测试失败：";
        r9 = r38;
        r14 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0380, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x037a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x037b, code lost:
    
        r18 = "测试失败：";
        r3 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0163 A[Catch: all -> 0x0131, CancellationException -> 0x013a, TRY_ENTER, TRY_LEAVE, TryCatch #27 {CancellationException -> 0x013a, all -> 0x0131, blocks: (B:185:0x012c, B:172:0x0163), top: B:184:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x030c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03dc A[Catch: all -> 0x03b4, TryCatch #14 {all -> 0x03b4, blocks: (B:52:0x039d, B:56:0x03ba, B:58:0x03dc, B:59:0x03e4, B:119:0x046f), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0419 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r33v0, types: [u5.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r34v0, types: [u5.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r44v0, types: [u5.t, java.lang.Object] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C1281sn m2152c;
        String str;
        List synchronizedList;
        long currentTimeMillis;
        String str2;
        long j6;
        List list;
        long j7;
        String str3;
        InetAddress byName;
        InterfaceC0516a0 interfaceC0516a0;
        long j8;
        InetAddress inetAddress;
        List list2;
        String str4;
        Network network;
        Object m1122A;
        List list3;
        InterfaceC0516a0 interfaceC0516a02;
        long j9;
        String hostAddress;
        String hostAddress2;
        C3377t c3377t;
        C3377t c3377t2;
        long j10;
        List list4;
        String str5;
        String message;
        String message2;
        Iterator it;
        C1219qn c1219qn;
        String str6;
        C1281sn m2332a;
        Iterator it2;
        C1219qn c1219qn2;
        String str7;
        C1281sn m2332a2;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        int i7 = this.f6913m;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            j7 = this.f6912l;
                            list = this.f6909i;
                            try {
                                AbstractC1793a0.m2972L(obj);
                                currentTimeMillis = j7;
                                synchronizedList = list;
                                this.f6915o.f7137b.set(false);
                                AbstractC3367j.m5097b(synchronizedList);
                                it2 = synchronizedList.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        ((Socket) it2.next()).close();
                                    } catch (Throwable th) {
                                        AbstractC1793a0.m2985m(th);
                                    }
                                }
                                synchronizedList.clear();
                                c1219qn2 = this.f6915o;
                                synchronized (c1219qn2.f7139d) {
                                    if (c1219qn2.f7140e == synchronizedList) {
                                        c1219qn2.f7140e = null;
                                    }
                                }
                                C1281sn c1281sn = (C1281sn) this.f6915o.f7141f.getValue();
                                boolean m5096a = AbstractC3367j.m5096a(c1281sn.f7642q, "已停止，连接已清除");
                                C1219qn c1219qn3 = this.f6915o;
                                if (m5096a) {
                                    m2332a2 = c1219qn3.m2152c();
                                } else {
                                    int i8 = c1281sn.f7640o;
                                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                    if (c1281sn.f7637l > 0) {
                                        str7 = AbstractC2487d.m4058v("已完成，连接已清除。", c1281sn.f7642q);
                                    } else {
                                        str7 = c1281sn.f7642q;
                                    }
                                    m2332a2 = C1281sn.m2332a(c1281sn, null, 0, 0, 0, 0, i8, currentTimeMillis2, str7, null, 139262);
                                }
                                c1219qn3.m2155h(m2332a2);
                            } catch (CancellationException e7) {
                                throw e7;
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = "测试失败：";
                                C1219qn c1219qn4 = this.f6915o;
                                C1281sn c1281sn2 = (C1281sn) c1219qn4.f7141f.getValue();
                                message = th.getMessage();
                                if (message == null) {
                                }
                                c1219qn4.m2155h(C1281sn.m2332a(c1281sn2, null, 0, 0, 0, 0, 0, 0L, message, null, 196606));
                                C1219qn c1219qn5 = this.f6915o;
                                message2 = th.getMessage();
                                if (message2 == null) {
                                }
                                C1219qn.m2148a(c1219qn5, str2.concat(message2));
                                this.f6915o.f7137b.set(false);
                                AbstractC3367j.m5097b(list);
                                it = list.iterator();
                                while (it.hasNext()) {
                                }
                                list.clear();
                                c1219qn = this.f6915o;
                                synchronized (c1219qn.f7139d) {
                                }
                            }
                            return C1694m.f10482a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j11 = this.f6912l;
                    c3377t2 = this.f6911k;
                    c3377t = this.f6910j;
                    synchronizedList = this.f6909i;
                    interfaceC0516a0 = (InterfaceC0516a0) this.f6914n;
                    try {
                        AbstractC1793a0.m2972L(obj);
                        currentTimeMillis = j11;
                        try {
                            try {
                                if (c3377t2.f16449e < this.f6922v) {
                                    str2 = "测试失败：";
                                } else {
                                    C1219qn c1219qn6 = this.f6915o;
                                    str2 = "测试失败：";
                                    try {
                                        c1219qn6.m2155h(C1281sn.m2332a((C1281sn) c1219qn6.f7141f.getValue(), null, 0, 0, 0, 0, 0, 0L, "累计失败达到 " + this.f6922v + "，真实保持约 " + synchronizedList.size() + " 个会话", null, 196607));
                                        C1219qn.m2148a(this.f6915o, "累计失败 " + c3377t2.f16449e + " 个，停止继续扩张");
                                    } catch (Throwable th3) {
                                        th = th3;
                                        j7 = currentTimeMillis;
                                        list = synchronizedList;
                                        C1219qn c1219qn42 = this.f6915o;
                                        C1281sn c1281sn22 = (C1281sn) c1219qn42.f7141f.getValue();
                                        message = th.getMessage();
                                        if (message == null) {
                                            message = "测试失败";
                                        }
                                        c1219qn42.m2155h(C1281sn.m2332a(c1281sn22, null, 0, 0, 0, 0, 0, 0L, message, null, 196606));
                                        C1219qn c1219qn52 = this.f6915o;
                                        message2 = th.getMessage();
                                        if (message2 == null) {
                                            message2 = th.getClass().getSimpleName();
                                        }
                                        C1219qn.m2148a(c1219qn52, str2.concat(message2));
                                        this.f6915o.f7137b.set(false);
                                        AbstractC3367j.m5097b(list);
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            try {
                                                ((Socket) it.next()).close();
                                            } catch (Throwable th4) {
                                                AbstractC1793a0.m2985m(th4);
                                            }
                                        }
                                        list.clear();
                                        c1219qn = this.f6915o;
                                        synchronized (c1219qn.f7139d) {
                                            if (c1219qn.f7140e == list) {
                                                c1219qn.f7140e = null;
                                            }
                                        }
                                        C1281sn c1281sn3 = (C1281sn) this.f6915o.f7141f.getValue();
                                        boolean m5096a2 = AbstractC3367j.m5096a(c1281sn3.f7642q, "已停止，连接已清除");
                                        C1219qn c1219qn7 = this.f6915o;
                                        if (m5096a2) {
                                            m2332a = c1219qn7.m2152c();
                                        } else {
                                            int i9 = c1281sn3.f7640o;
                                            long currentTimeMillis3 = System.currentTimeMillis() - j7;
                                            if (c1281sn3.f7637l > 0) {
                                                str6 = AbstractC2487d.m4058v("已完成，连接已清除。", c1281sn3.f7642q);
                                            } else {
                                                str6 = c1281sn3.f7642q;
                                            }
                                            m2332a = C1281sn.m2332a(c1281sn3, null, 0, 0, 0, 0, i9, currentTimeMillis3, str6, null, 139262);
                                        }
                                        c1219qn7.m2155h(m2332a);
                                        return C1694m.f10482a;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                str2 = "测试失败：";
                            }
                            try {
                                AbstractC3367j.m5097b(synchronizedList);
                                int m2151f = C1219qn.m2151f(synchronizedList);
                                if (c3377t.f16449e >= this.f6918r && c3377t2.f16449e == 0) {
                                    str5 = "未触达上限，至少可保持 " + m2151f + " 个 TCP 会话";
                                } else {
                                    str5 = "估算上限约 " + m2151f + " 个 TCP 会话";
                                }
                                C1219qn c1219qn8 = this.f6915o;
                                C1281sn c1281sn4 = (C1281sn) c1219qn8.f7141f.getValue();
                                int i10 = this.f6920t;
                                if (i10 > 0) {
                                    str5 = str5 + "，保持连接 " + i10 + "s 以观察稳定性";
                                }
                                c1219qn8.m2155h(C1281sn.m2332a(c1281sn4, null, 0, 0, 0, m2151f, m2151f, 0L, str5, null, 172031));
                                int i11 = this.f6920t;
                                if (i11 > 0) {
                                    C1219qn c1219qn9 = this.f6915o;
                                    this.f6914n = interfaceC0516a0;
                                    this.f6909i = synchronizedList;
                                    this.f6910j = null;
                                    this.f6911k = null;
                                    this.f6912l = currentTimeMillis;
                                    this.f6913m = 3;
                                    j10 = currentTimeMillis;
                                    list4 = synchronizedList;
                                    try {
                                        if (C1219qn.m2149b(c1219qn9, i11, j10, list4, this) != enumC2465a) {
                                            j7 = j10;
                                            list = list4;
                                            currentTimeMillis = j7;
                                            synchronizedList = list;
                                            this.f6915o.f7137b.set(false);
                                            AbstractC3367j.m5097b(synchronizedList);
                                            it2 = synchronizedList.iterator();
                                            while (it2.hasNext()) {
                                            }
                                            synchronizedList.clear();
                                            c1219qn2 = this.f6915o;
                                            synchronized (c1219qn2.f7139d) {
                                            }
                                        }
                                        return enumC2465a;
                                    } catch (CancellationException e8) {
                                        e = e8;
                                        throw e;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        j7 = j10;
                                        list = list4;
                                        C1219qn c1219qn422 = this.f6915o;
                                        C1281sn c1281sn222 = (C1281sn) c1219qn422.f7141f.getValue();
                                        message = th.getMessage();
                                        if (message == null) {
                                        }
                                        c1219qn422.m2155h(C1281sn.m2332a(c1281sn222, null, 0, 0, 0, 0, 0, 0L, message, null, 196606));
                                        C1219qn c1219qn522 = this.f6915o;
                                        message2 = th.getMessage();
                                        if (message2 == null) {
                                        }
                                        C1219qn.m2148a(c1219qn522, str2.concat(message2));
                                        this.f6915o.f7137b.set(false);
                                        AbstractC3367j.m5097b(list);
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                        }
                                        list.clear();
                                        c1219qn = this.f6915o;
                                        synchronized (c1219qn.f7139d) {
                                        }
                                    }
                                } else {
                                    this.f6915o.f7137b.set(false);
                                    AbstractC3367j.m5097b(synchronizedList);
                                    it2 = synchronizedList.iterator();
                                    while (it2.hasNext()) {
                                    }
                                    synchronizedList.clear();
                                    c1219qn2 = this.f6915o;
                                    synchronized (c1219qn2.f7139d) {
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                j10 = currentTimeMillis;
                                list4 = synchronizedList;
                                j7 = j10;
                                list = list4;
                                C1219qn c1219qn4222 = this.f6915o;
                                C1281sn c1281sn2222 = (C1281sn) c1219qn4222.f7141f.getValue();
                                message = th.getMessage();
                                if (message == null) {
                                }
                                c1219qn4222.m2155h(C1281sn.m2332a(c1281sn2222, null, 0, 0, 0, 0, 0, 0L, message, null, 196606));
                                C1219qn c1219qn5222 = this.f6915o;
                                message2 = th.getMessage();
                                if (message2 == null) {
                                }
                                C1219qn.m2148a(c1219qn5222, str2.concat(message2));
                                this.f6915o.f7137b.set(false);
                                AbstractC3367j.m5097b(list);
                                it = list.iterator();
                                while (it.hasNext()) {
                                }
                                list.clear();
                                c1219qn = this.f6915o;
                                synchronized (c1219qn.f7139d) {
                                }
                            }
                        } catch (CancellationException e9) {
                            e = e9;
                            j10 = currentTimeMillis;
                            list4 = synchronizedList;
                        }
                    } catch (CancellationException e10) {
                        e = e10;
                        throw e;
                    } catch (Throwable th8) {
                        th = th8;
                        str2 = "测试失败：";
                        j7 = j11;
                        list = synchronizedList;
                        C1219qn c1219qn42222 = this.f6915o;
                        C1281sn c1281sn22222 = (C1281sn) c1219qn42222.f7141f.getValue();
                        message = th.getMessage();
                        if (message == null) {
                        }
                        c1219qn42222.m2155h(C1281sn.m2332a(c1281sn22222, null, 0, 0, 0, 0, 0, 0L, message, null, 196606));
                        C1219qn c1219qn52222 = this.f6915o;
                        message2 = th.getMessage();
                        if (message2 == null) {
                        }
                        C1219qn.m2148a(c1219qn52222, str2.concat(message2));
                        this.f6915o.f7137b.set(false);
                        AbstractC3367j.m5097b(list);
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        list.clear();
                        c1219qn = this.f6915o;
                        synchronized (c1219qn.f7139d) {
                        }
                    }
                } else {
                    j9 = this.f6912l;
                    List list5 = this.f6909i;
                    interfaceC0516a02 = (InterfaceC0516a0) this.f6914n;
                    try {
                        AbstractC1793a0.m2972L(obj);
                        list3 = list5;
                        m1122A = obj;
                    } catch (CancellationException e11) {
                        CancellationException e12 = e11;
                        throw e12;
                    } catch (Throwable th9) {
                        th = th9;
                        str2 = "测试失败：";
                        list = list5;
                        j7 = j9;
                        C1219qn c1219qn422222 = this.f6915o;
                        C1281sn c1281sn222222 = (C1281sn) c1219qn422222.f7141f.getValue();
                        message = th.getMessage();
                        if (message == null) {
                        }
                        c1219qn422222.m2155h(C1281sn.m2332a(c1281sn222222, null, 0, 0, 0, 0, 0, 0L, message, null, 196606));
                        C1219qn c1219qn522222 = this.f6915o;
                        message2 = th.getMessage();
                        if (message2 == null) {
                        }
                        C1219qn.m2148a(c1219qn522222, str2.concat(message2));
                        this.f6915o.f7137b.set(false);
                        AbstractC3367j.m5097b(list);
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        list.clear();
                        c1219qn = this.f6915o;
                        synchronized (c1219qn.f7139d) {
                        }
                    }
                }
            } else {
                AbstractC1793a0.m2972L(obj);
                InterfaceC0516a0 interfaceC0516a03 = (InterfaceC0516a0) this.f6914n;
                synchronizedList = Collections.synchronizedList(new ArrayList());
                C1219qn c1219qn10 = this.f6915o;
                synchronized (c1219qn10.f7139d) {
                    c1219qn10.f7140e = synchronizedList;
                }
                currentTimeMillis = System.currentTimeMillis();
                try {
                    this.f6915o.m2155h(new C1281sn(this.f6916p, this.f6917q, this.f6918r, this.f6919s, this.f6920t, this.f6921u, this.f6922v, this.f6923w, "正在解析目标...", 195588));
                    str3 = this.f6924x;
                } catch (CancellationException e13) {
                    e = e13;
                    j6 = currentTimeMillis;
                } catch (Throwable th10) {
                    th = th10;
                    str2 = "测试失败：";
                    j6 = currentTimeMillis;
                }
                try {
                    if (str3 != null) {
                        try {
                            try {
                                if (AbstractC0444k.m937a0(str3)) {
                                    str3 = null;
                                }
                                if (str3 != null && (byName = InetAddress.getByName(str3)) != null) {
                                    interfaceC0516a0 = interfaceC0516a03;
                                    j8 = currentTimeMillis;
                                    inetAddress = byName;
                                    list2 = synchronizedList;
                                    C1219qn c1219qn11 = this.f6915o;
                                    C1281sn c1281sn5 = (C1281sn) c1219qn11.f7141f.getValue();
                                    hostAddress = inetAddress.getHostAddress();
                                    if (hostAddress == null) {
                                        try {
                                            hostAddress = this.f6916p;
                                        } catch (CancellationException e14) {
                                            throw e14;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            str2 = "测试失败：";
                                            j7 = j8;
                                            list = list2;
                                            C1219qn c1219qn4222222 = this.f6915o;
                                            C1281sn c1281sn2222222 = (C1281sn) c1219qn4222222.f7141f.getValue();
                                            message = th.getMessage();
                                            if (message == null) {
                                            }
                                            c1219qn4222222.m2155h(C1281sn.m2332a(c1281sn2222222, null, 0, 0, 0, 0, 0, 0L, message, null, 196606));
                                            C1219qn c1219qn5222222 = this.f6915o;
                                            message2 = th.getMessage();
                                            if (message2 == null) {
                                            }
                                            C1219qn.m2148a(c1219qn5222222, str2.concat(message2));
                                            this.f6915o.f7137b.set(false);
                                            AbstractC3367j.m5097b(list);
                                            it = list.iterator();
                                            while (it.hasNext()) {
                                            }
                                            list.clear();
                                            c1219qn = this.f6915o;
                                            synchronized (c1219qn.f7139d) {
                                            }
                                        }
                                    }
                                    c1219qn11.m2155h(C1281sn.m2332a(c1281sn5, hostAddress, 0, 0, 0, 0, 0, 0L, null, null, 262139));
                                    C1219qn c1219qn12 = this.f6915o;
                                    hostAddress2 = inetAddress.getHostAddress();
                                    if (hostAddress2 == null) {
                                        hostAddress2 = this.f6916p;
                                    }
                                    C1219qn.m2148a(c1219qn12, "目标解析为 ".concat(hostAddress2));
                                    ?? obj2 = new Object();
                                    ?? obj3 = new Object();
                                    ?? obj4 = new Object();
                                    C1157on c1157on = new C1157on(this.f6919s, this.f6918r, this.f6915o, obj2, obj4, this.f6922v, new Object(), this.f6923w, j8, inetAddress, this.f6917q, this.f6921u, this.f6925y, obj3, list2, null);
                                    c3377t = obj2;
                                    c3377t2 = obj4;
                                    currentTimeMillis = j8;
                                    synchronizedList = list2;
                                    this.f6914n = interfaceC0516a0;
                                    this.f6909i = synchronizedList;
                                    this.f6910j = c3377t;
                                    this.f6911k = c3377t2;
                                    this.f6912l = currentTimeMillis;
                                    this.f6913m = 2;
                                }
                            } catch (CancellationException e15) {
                                e = e15;
                                throw e;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            str2 = "测试失败：";
                            j7 = currentTimeMillis;
                            list = synchronizedList;
                            C1219qn c1219qn42222222 = this.f6915o;
                            C1281sn c1281sn22222222 = (C1281sn) c1219qn42222222.f7141f.getValue();
                            message = th.getMessage();
                            if (message == null) {
                            }
                            c1219qn42222222.m2155h(C1281sn.m2332a(c1281sn22222222, null, 0, 0, 0, 0, 0, 0L, message, null, 196606));
                            C1219qn c1219qn52222222 = this.f6915o;
                            message2 = th.getMessage();
                            if (message2 == null) {
                            }
                            C1219qn.m2148a(c1219qn52222222, str2.concat(message2));
                            this.f6915o.f7137b.set(false);
                            AbstractC3367j.m5097b(list);
                            it = list.iterator();
                            while (it.hasNext()) {
                            }
                            list.clear();
                            c1219qn = this.f6915o;
                            synchronized (c1219qn.f7139d) {
                            }
                        }
                    }
                    m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0341k(str4, network, null, 13), this);
                    if (m1122A != enumC2465a) {
                        list3 = synchronizedList;
                        interfaceC0516a02 = interfaceC0516a03;
                        j9 = j6;
                    }
                    return enumC2465a;
                } catch (CancellationException e16) {
                    e = e16;
                    throw e;
                } catch (Throwable th13) {
                    th = th13;
                    str2 = "测试失败：";
                    list = synchronizedList;
                    j7 = j6;
                    C1219qn c1219qn422222222 = this.f6915o;
                    C1281sn c1281sn222222222 = (C1281sn) c1219qn422222222.f7141f.getValue();
                    message = th.getMessage();
                    if (message == null) {
                    }
                    c1219qn422222222.m2155h(C1281sn.m2332a(c1281sn222222222, null, 0, 0, 0, 0, 0, 0L, message, null, 196606));
                    C1219qn c1219qn522222222 = this.f6915o;
                    message2 = th.getMessage();
                    if (message2 == null) {
                    }
                    C1219qn.m2148a(c1219qn522222222, str2.concat(message2));
                    this.f6915o.f7137b.set(false);
                    AbstractC3367j.m5097b(list);
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    list.clear();
                    c1219qn = this.f6915o;
                    synchronized (c1219qn.f7139d) {
                    }
                }
                str4 = this.f6916p;
                network = this.f6925y;
                this.f6914n = interfaceC0516a03;
                this.f6909i = synchronizedList;
                this.f6912l = currentTimeMillis;
                this.f6913m = 1;
                C2325e c2325e = AbstractC0549l0.f1898a;
                j6 = currentTimeMillis;
            }
            inetAddress = (InetAddress) m1122A;
            list2 = list3;
            j8 = j9;
            interfaceC0516a0 = interfaceC0516a02;
            C1219qn c1219qn112 = this.f6915o;
            C1281sn c1281sn52 = (C1281sn) c1219qn112.f7141f.getValue();
            hostAddress = inetAddress.getHostAddress();
            if (hostAddress == null) {
            }
            c1219qn112.m2155h(C1281sn.m2332a(c1281sn52, hostAddress, 0, 0, 0, 0, 0, 0L, null, null, 262139));
            C1219qn c1219qn122 = this.f6915o;
            hostAddress2 = inetAddress.getHostAddress();
            if (hostAddress2 == null) {
            }
            C1219qn.m2148a(c1219qn122, "目标解析为 ".concat(hostAddress2));
            ?? obj22 = new Object();
            ?? obj32 = new Object();
            ?? obj42 = new Object();
            C1157on c1157on2 = new C1157on(this.f6919s, this.f6918r, this.f6915o, obj22, obj42, this.f6922v, new Object(), this.f6923w, j8, inetAddress, this.f6917q, this.f6921u, this.f6925y, obj32, list2, null);
            c3377t = obj22;
            c3377t2 = obj42;
            currentTimeMillis = j8;
            synchronizedList = list2;
            this.f6914n = interfaceC0516a0;
            this.f6909i = synchronizedList;
            this.f6910j = c3377t;
            this.f6911k = c3377t2;
            this.f6912l = currentTimeMillis;
            this.f6913m = 2;
        } catch (Throwable th14) {
            this.f6915o.f7137b.set(false);
            AbstractC3367j.m5097b("累计失败 ");
            Iterator it3 = "累计失败 ".iterator();
            while (it3.hasNext()) {
                try {
                    ((Socket) it3.next()).close();
                } catch (Throwable th15) {
                    AbstractC1793a0.m2985m(th15);
                }
            }
            "累计失败 ".clear();
            C1219qn c1219qn13 = this.f6915o;
            synchronized (c1219qn13.f7139d) {
                if (c1219qn13.f7140e == "累计失败 ") {
                    c1219qn13.f7140e = null;
                }
                C1281sn c1281sn6 = (C1281sn) this.f6915o.f7141f.getValue();
                boolean m5096a3 = AbstractC3367j.m5096a(c1281sn6.f7642q, "已停止，连接已清除");
                C1219qn c1219qn14 = this.f6915o;
                if (!m5096a3) {
                    int i12 = c1281sn6.f7640o;
                    long currentTimeMillis4 = System.currentTimeMillis() - "估算上限约 ";
                    if (c1281sn6.f7637l > 0) {
                        str = AbstractC2487d.m4058v("已完成，连接已清除。", c1281sn6.f7642q);
                    } else {
                        str = c1281sn6.f7642q;
                    }
                    m2152c = C1281sn.m2332a(c1281sn6, null, 0, 0, 0, 0, i12, currentTimeMillis4, str, null, 139262);
                } else {
                    m2152c = c1219qn14.m2152c();
                }
                c1219qn14.m2155h(m2152c);
                throw th14;
            }
        }
    }
}
