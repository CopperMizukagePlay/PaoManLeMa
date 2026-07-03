package p015b6;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import p001a0.C0005b;
import p001a0.C0078t0;
import p017c.C0321f;
import p024c6.AbstractC0444k;
import p024c6.C0438e;
import p024c6.C0439f;
import p024c6.C0442i;
import p032d6.InterfaceC0520b1;
import p039e5.AbstractC0945hr;
import p039e5.AbstractC1483z8;
import p039e5.C0781cm;
import p039e5.C0800d9;
import p039e5.C0831e9;
import p039e5.C0866fc;
import p039e5.C1036kq;
import p039e5.C1054ld;
import p039e5.C1100ms;
import p039e5.C1195q;
import p039e5.C1394wc;
import p039e5.C1471yr;
import p039e5.C1473yt;
import p039e5.EnumC0768c9;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1792a;
import p060h5.AbstractC1798f;
import p060h5.AbstractC1805m;
import p077k.C2182b0;
import p077k.C2196i0;
import p080k2.C2294e;
import p080k2.C2306q;
import p085l0.C2345c1;
import p085l0.C2414u1;
import p085l0.C2415v;
import p085l0.EnumC2408s1;
import p087l2.C2432a;
import p087l2.C2438d;
import p087l2.C2440e;
import p087l2.C2442f;
import p087l2.C2445i;
import p087l2.C2456t;
import p087l2.C2457u;
import p087l2.C2458v;
import p087l2.InterfaceC2443g;
import p091l6.C2472c;
import p092m.AbstractC2487d;
import p144t.AbstractC3122c;
import p144t.C3137j0;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p152u.C3320h;
import p153u0.C3336c;
import p153u0.InterfaceC3338e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3380w;
import p161v0.AbstractC3479z;
import p161v0.C3473t;
import p161v0.C3474u;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C0310q implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f1104e;

    /* renamed from: f */
    public final /* synthetic */ Object f1105f;

    public /* synthetic */ C0310q(int i7, Object obj) {
        this.f1104e = i7;
        this.f1105f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        String valueOf;
        String str;
        String concat;
        StringBuilder sb;
        int i7;
        boolean z7 = false;
        Object[] objArr = 0;
        boolean z8 = true;
        switch (this.f1104e) {
            case 0:
                C1036kq c1036kq = (C1036kq) this.f1105f;
                AbstractC3367j.m5100e(obj, "it");
                return c1036kq.mo52a();
            case 1:
                Uri uri = (Uri) this.f1105f;
                C0800d9 c0800d9 = (C0800d9) obj;
                AbstractC3367j.m5100e(c0800d9, "it");
                String uri2 = uri.toString();
                AbstractC3367j.m5099d(uri2, "toString(...)");
                return C0800d9.m1498a(c0800d9, null, null, null, 0L, 0L, 0L, false, null, 0L, null, uri2, 2097151);
            case 2:
                Throwable th = (Throwable) this.f1105f;
                C0800d9 c0800d92 = (C0800d9) obj;
                AbstractC3367j.m5100e(c0800d92, "it");
                EnumC0768c9 enumC0768c9 = EnumC0768c9.f3011k;
                String message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getSimpleName();
                }
                return C0800d9.m1498a(c0800d92, null, null, enumC0768c9, 0L, 0L, 0L, false, message, 0L, null, null, 4044799);
            case 3:
                C1195q c1195q = (C1195q) this.f1105f;
                return C0831e9.m1519a((C0831e9) obj, c1195q.f6958b, c1195q.f6959c, 0L, 0L, null, "尾段竞速", 49);
            case 4:
                return AbstractC1805m.m3058v0((List) obj, (ArrayList) this.f1105f);
            case AbstractC3122c.f15761f /* 5 */:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1105f;
                C0439f c0439f = (C0439f) obj;
                AbstractC3367j.m5100e(c0439f, "it");
                C0442i c0442i = AbstractC1483z8.f9834a;
                String group = c0439f.f1497a.group();
                AbstractC3367j.m5099d(group, "group(...)");
                return new C0781cm(AbstractC1483z8.m2436a(AbstractC0444k.m959w0(group, '\\')), linkedHashMap);
            case AbstractC3122c.f15759d /* 6 */:
                return ((JSONArray) this.f1105f).optJSONObject(((Integer) obj).intValue());
            case 7:
                C1394wc c1394wc = (C1394wc) this.f1105f;
                C3320h c3320h = (C3320h) obj;
                AbstractC3367j.m5100e(c3320h, "$this$LazyColumn");
                List list = c1394wc.f8343s;
                AbstractC3367j.m5100e(list, "<this>");
                C0438e c0438e = new C0438e(list);
                c3320h.m5054m(c0438e.mo299a(), new C0078t0(13, new C0866fc(5), c0438e), new C0005b(11, c0438e), new C3173d(-632812321, new C1054ld(objArr == true ? 1 : 0, c0438e), true));
                return C1694m.f10482a;
            case 8:
                ((InterfaceC3277a) this.f1105f).mo52a();
                return C1694m.f10482a;
            case AbstractC3122c.f15758c /* 9 */:
                C2345c1 c2345c1 = (C2345c1) this.f1105f;
                float floatValue = ((Float) obj).floatValue();
                C3137j0 c3137j0 = AbstractC0945hr.f4635a;
                c2345c1.m3730h(floatValue);
                return C1694m.f10482a;
            case AbstractC3122c.f15760e /* 10 */:
                C1100ms c1100ms = (C1100ms) this.f1105f;
                Map.Entry entry = (Map.Entry) obj;
                AbstractC3367j.m5100e(entry, "it");
                String str2 = ((C1471yr) entry.getValue()).f9773i;
                c1100ms.getClass();
                if (AbstractC3367j.m5096a(str2, "已结束") || AbstractC3367j.m5096a(str2, "已停止")) {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            case 11:
                C1473yt.m2432c((C1473yt) this.f1105f, (String) obj);
                return C1694m.f10482a;
            case 12:
                if (obj == ((AbstractC1792a) this.f1105f)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 13:
                String str3 = "(this Map)";
                AbstractC1798f abstractC1798f = (AbstractC1798f) this.f1105f;
                Map.Entry entry2 = (Map.Entry) obj;
                AbstractC3367j.m5100e(entry2, "it");
                StringBuilder sb2 = new StringBuilder();
                Object key = entry2.getKey();
                if (key == abstractC1798f) {
                    valueOf = "(this Map)";
                } else {
                    valueOf = String.valueOf(key);
                }
                sb2.append(valueOf);
                sb2.append('=');
                Object value = entry2.getValue();
                if (value != abstractC1798f) {
                    str3 = String.valueOf(value);
                }
                sb2.append(str3);
                return sb2.toString();
            case 14:
                C2306q c2306q = (C2306q) obj;
                return ((C2294e) this.f1105f).m3677a(new C2306q(null, c2306q.f13246b, c2306q.f13247c, c2306q.f13248d, c2306q.f13249e)).f13250e;
            case AbstractC3122c.f15762g /* 15 */:
                ((C2415v) this.f1105f).m3951y(obj);
                return C1694m.f10482a;
            case 16:
                C2414u1 c2414u1 = (C2414u1) this.f1105f;
                Throwable th2 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th2);
                synchronized (c2414u1.f13580b) {
                    try {
                        InterfaceC0520b1 interfaceC0520b1 = c2414u1.f13581c;
                        if (interfaceC0520b1 != null) {
                            C1701c0 c1701c0 = c2414u1.f13598t;
                            EnumC2408s1 enumC2408s1 = EnumC2408s1.f13551f;
                            c1701c0.getClass();
                            c1701c0.m2752j(null, enumC2408s1);
                            interfaceC0520b1.mo1114c(cancellationException);
                            c2414u1.f13595q = null;
                            interfaceC0520b1.mo1119y(new C0321f(17, c2414u1, th2));
                        } else {
                            c2414u1.f13582d = cancellationException;
                            C1701c0 c1701c02 = c2414u1.f13598t;
                            EnumC2408s1 enumC2408s12 = EnumC2408s1.f13550e;
                            c1701c02.getClass();
                            c1701c02.m2752j(null, enumC2408s12);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return C1694m.f10482a;
            case 17:
                C2196i0 c2196i0 = (C2196i0) this.f1105f;
                if (obj instanceof AbstractC3479z) {
                    ((AbstractC3479z) obj).m5284f(4);
                }
                c2196i0.m3599a(obj);
                return C1694m.f10482a;
            case 18:
                InterfaceC2443g interfaceC2443g = (InterfaceC2443g) obj;
                if (((InterfaceC2443g) this.f1105f) == interfaceC2443g) {
                    str = " > ";
                } else {
                    str = "   ";
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                if (interfaceC2443g instanceof C2432a) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    C2432a c2432a = (C2432a) interfaceC2443g;
                    sb.append(c2432a.f13653a.f10239f.length());
                    sb.append(", newCursorPosition=");
                    i7 = c2432a.f13654b;
                } else if (interfaceC2443g instanceof C2457u) {
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    C2457u c2457u = (C2457u) interfaceC2443g;
                    sb.append(c2457u.f13719a.f10239f.length());
                    sb.append(", newCursorPosition=");
                    i7 = c2457u.f13720b;
                } else {
                    if (interfaceC2443g instanceof C2456t) {
                        concat = ((C2456t) interfaceC2443g).toString();
                    } else if (interfaceC2443g instanceof C2440e) {
                        concat = ((C2440e) interfaceC2443g).toString();
                    } else if (interfaceC2443g instanceof C2442f) {
                        concat = ((C2442f) interfaceC2443g).toString();
                    } else if (interfaceC2443g instanceof C2458v) {
                        concat = ((C2458v) interfaceC2443g).toString();
                    } else if (interfaceC2443g instanceof C2445i) {
                        concat = "FinishComposingTextCommand()";
                    } else if (interfaceC2443g instanceof C2438d) {
                        concat = "DeleteAllCommand()";
                    } else {
                        String m5093b = AbstractC3380w.m5108a(interfaceC2443g.getClass()).m5093b();
                        if (m5093b == null) {
                            m5093b = "{anonymous EditCommand}";
                        }
                        concat = "Unknown EditCommand: ".concat(m5093b);
                    }
                    sb3.append(concat);
                    return sb3.toString();
                }
                concat = AbstractC2487d.m4045i(sb, i7, ')');
                sb3.append(concat);
                return sb3.toString();
            case 19:
                ((C2472c) this.f1105f).m4030f(null);
                return C1694m.f10482a;
            case 20:
                InterfaceC3338e interfaceC3338e = ((C3336c) this.f1105f).f16395g;
                if (interfaceC3338e != null) {
                    z8 = interfaceC3338e.mo5074c(obj);
                }
                return Boolean.valueOf(z8);
            default:
                C3474u c3474u = (C3474u) this.f1105f;
                synchronized (c3474u.f16759g) {
                    C3473t c3473t = c3474u.f16761i;
                    AbstractC3367j.m5097b(c3473t);
                    Object obj2 = c3473t.f16742b;
                    AbstractC3367j.m5097b(obj2);
                    int i8 = c3473t.f16744d;
                    C2182b0 c2182b0 = c3473t.f16743c;
                    if (c2182b0 == null) {
                        c2182b0 = new C2182b0();
                        c3473t.f16743c = c2182b0;
                        c3473t.f16746f.m3598m(obj2, c2182b0);
                    }
                    c3473t.m5275c(obj, i8, obj2, c2182b0);
                }
                return C1694m.f10482a;
        }
    }

    public /* synthetic */ C0310q(int i7, Object obj, Object obj2) {
        this.f1104e = i7;
        this.f1105f = obj;
    }
}
