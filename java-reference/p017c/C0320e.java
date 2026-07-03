package p017c;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p024c6.AbstractC0444k;
import p024c6.C0442i;
import p028d2.C0492y;
import p032d6.AbstractC0525d0;
import p039e5.AbstractC0945hr;
import p039e5.AbstractC1092mk;
import p039e5.C0782cn;
import p039e5.C0800d9;
import p039e5.C0877fn;
import p039e5.C0910go;
import p039e5.C0918h0;
import p039e5.C0927h9;
import p039e5.C1006jr;
import p039e5.C1189po;
import p039e5.C1195q;
import p039e5.C1196q0;
import p039e5.C1226r;
import p039e5.C1248rl;
import p039e5.C1467yn;
import p039e5.C1473yt;
import p039e5.C1476z1;
import p039e5.C1504zt;
import p039e5.EnumC0704a9;
import p039e5.EnumC0748bl;
import p039e5.EnumC0964ie;
import p039e5.EnumC1003jo;
import p039e5.EnumC1127no;
import p039e5.EnumC1390w8;
import p039e5.EnumC1436xn;
import p039e5.EnumC1452y8;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p067i4.AbstractC2072e;
import p077k.C2196i0;
import p085l0.AbstractC2346c2;
import p085l0.C2338a2;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p085l0.C2395p;
import p085l0.C2415v;
import p085l0.C2420w1;
import p085l0.C2429z1;
import p085l0.InterfaceC2417v1;
import p085l0.InterfaceC2425y0;
import p099m6.C2625z;
import p144t.AbstractC3122c;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p161v0.C3472s;
import p169w0.C3645b;
import p169w0.C3650g;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0320e implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f1122e;

    /* renamed from: f */
    public final /* synthetic */ Object f1123f;

    /* renamed from: g */
    public final /* synthetic */ Object f1124g;

    public /* synthetic */ C0320e(int i7, Object obj, Object obj2) {
        this.f1122e = i7;
        this.f1123f = obj;
        this.f1124g = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb A[ORIG_RETURN, RETURN] */
    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo52a() {
        String str;
        String str2;
        int i7;
        C2420w1 c2420w1;
        InterfaceC2417v1 interfaceC2417v1;
        C2420w1 c2420w12;
        InterfaceC2417v1 interfaceC2417v12;
        int i8 = this.f1122e;
        int i9 = 8;
        int i10 = 4;
        Object obj = null;
        C3650g c3650g = null;
        int i11 = 0;
        C1694m c1694m = C1694m.f10482a;
        Object obj2 = this.f1124g;
        Object obj3 = this.f1123f;
        switch (i8) {
            case 0:
                ((C0325j) obj3).f1136c = (InterfaceC3277a) obj2;
                return c1694m;
            case 1:
                return ((C0442i) obj3).m927a((String) obj2);
            case 2:
                C0800d9 c0800d9 = (C0800d9) obj3;
                C1195q c1195q = (C1195q) obj2;
                C2625z m2088L = C1196q0.m2088L(c0800d9, c0800d9.f3341b);
                m2088L.m4191c("Range", "bytes=" + c1195q.f6958b + "-" + c1195q.f6959c);
                m2088L.m4190b();
                return m2088L.m4189a();
            case 3:
                ((InterfaceC3279c) obj3).mo23f((EnumC0748bl) obj2);
                return c1694m;
            case 4:
                C1504zt c1504zt = (C1504zt) obj3;
                Context context = (Context) obj2;
                if (!AbstractC0444k.m937a0(c1504zt.f9985h)) {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(c1504zt.f9985h)));
                }
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                Context context2 = (Context) obj3;
                Object systemService = context2.getSystemService("clipboard");
                AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("dns", ((C0877fn) obj2).f4045a));
                Toast.makeText(context2, "已复制", 0).show();
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                ((InterfaceC2425y0) obj2).setValue((EnumC0704a9) obj3);
                return c1694m;
            case 7:
                ((InterfaceC2425y0) obj2).setValue((EnumC1390w8) obj3);
                return c1694m;
            case 8:
                C0927h9.m1553c((Context) obj3, null, 0, 0, null, 0, 0, (EnumC1390w8) obj2, 126);
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                C0927h9.m1553c((Context) obj3, (EnumC0704a9) obj2, 0, 0, null, 0, 0, null, 252);
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                C0927h9.m1553c((Context) obj3, null, 0, 0, (EnumC1452y8) obj2, 0, 0, null, 238);
                return c1694m;
            case 11:
                C1196q0 c1196q0 = (C1196q0) obj3;
                AbstractC0525d0.m1141s(c1196q0.f6966e, null, new C1226r(c1196q0, null), 3);
                ((InterfaceC2425y0) obj2).setValue(Boolean.FALSE);
                return c1694m;
            case 12:
                ((InterfaceC2425y0) obj2).setValue((EnumC0964ie) obj3);
                return c1694m;
            case 13:
                ((InterfaceC3279c) obj3).mo23f((EnumC0964ie) obj2);
                return c1694m;
            case 14:
                Context context3 = (Context) obj3;
                List list = (List) obj2;
                C1189po c1189po = (C1189po) AbstractC1805m.m3047k0(list);
                if (c1189po != null) {
                    i11 = c1189po.f6926a;
                }
                int i12 = AbstractC1092mk.m1693K3(context3).getInt("selected_profile_id", i11);
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((C1189po) next).f6926a == i12) {
                            obj = next;
                        }
                    }
                }
                C1189po c1189po2 = (C1189po) obj;
                if (c1189po2 != null) {
                    i11 = c1189po2.f6926a;
                }
                return new C2349d1(i11);
            case AbstractC3122c.f15762g /* 15 */:
                Context context4 = (Context) obj3;
                String m1698L3 = AbstractC1092mk.m1698L3((C1006jr) obj2);
                Object systemService2 = context4.getSystemService("clipboard");
                AbstractC3367j.m5098c(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText("URL", m1698L3));
                Toast.makeText(context4, "请求配置已复制", 0).show();
                return c1694m;
            case 16:
                ((InterfaceC3279c) obj3).mo23f((C1006jr) obj2);
                return c1694m;
            case 17:
                C3472s c3472s = (C3472s) obj2;
                for (C0910go c0910go : (List) obj3) {
                    List list2 = c0910go.f4326e;
                    String str3 = c0910go.f4327f;
                    C1467yn c1467yn = (C1467yn) AbstractC1805m.m3056t0(list2, new C0492y(new C0918h0(i9), i10));
                    if (c1467yn == null || (str = c1467yn.f9464a) == null) {
                        str = str3;
                    }
                    if (!AbstractC0444k.m937a0(str)) {
                        String str4 = c0910go.f4322a;
                        C1467yn c1467yn2 = (C1467yn) AbstractC1805m.m3056t0(c0910go.f4326e, new C0492y(new C0918h0(i9), i10));
                        if (c1467yn2 != null && (str2 = c1467yn2.f9464a) != null) {
                            str3 = str2;
                        }
                        c3472s.put(str4, AbstractC1793a0.m2970J(str3));
                    }
                }
                return c1694m;
            case 18:
                ((InterfaceC3279c) obj3).mo23f((C0910go) obj2);
                return c1694m;
            case 19:
                ((InterfaceC3279c) obj3).mo23f((EnumC1003jo) obj2);
                return c1694m;
            case 20:
                ((InterfaceC3279c) obj3).mo23f((EnumC1436xn) obj2);
                return c1694m;
            case 21:
                ((InterfaceC3279c) obj3).mo23f((EnumC1127no) obj2);
                return c1694m;
            case 22:
                C3137j0 c3137j0 = AbstractC0945hr.f4635a;
                ((InterfaceC2425y0) obj2).setValue((C1476z1) obj3);
                return c1694m;
            case 23:
                Context context5 = (Context) obj3;
                C3137j0 c3137j02 = AbstractC0945hr.f4635a;
                Object systemService3 = context5.getSystemService("clipboard");
                AbstractC3367j.m5098c(systemService3, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService3).setPrimaryClip(ClipData.newPlainText("崩溃日志", (String) obj2));
                Toast.makeText(context5, "已复制到剪贴板", 0).show();
                return c1694m;
            case 24:
                ((InterfaceC3279c) obj3).mo23f(((C1248rl) obj2).f7390a);
                return c1694m;
            case 25:
                ((InterfaceC3279c) obj3).mo23f(Integer.valueOf(((C0782cn) obj2).f3168a));
                return c1694m;
            case 26:
                C3137j0 c3137j03 = AbstractC0945hr.f4635a;
                ((InterfaceC3279c) obj3).mo23f(Float.valueOf(((C2345c1) obj2).m3729g()));
                return c1694m;
            case 27:
                Process exec = Runtime.getRuntime().exec((String[]) obj3);
                AbstractC3367j.m5097b(exec);
                ((C1473yt) obj2).getClass();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                try {
                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                        sb.append(readLine);
                        sb.append('\n');
                    }
                    bufferedReader.close();
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getErrorStream()));
                    try {
                        for (String readLine2 = bufferedReader2.readLine(); readLine2 != null; readLine2 = bufferedReader2.readLine()) {
                            sb.append(readLine2);
                            sb.append('\n');
                        }
                        bufferedReader2.close();
                        String sb2 = sb.toString();
                        AbstractC3367j.m5099d(sb2, "toString(...)");
                        exec.waitFor();
                        return sb2;
                    } finally {
                    }
                } finally {
                }
            case 28:
                C2196i0 c2196i0 = (C2196i0) obj3;
                C2415v c2415v = (C2415v) obj2;
                Object[] objArr = c2196i0.f12685b;
                long[] jArr = c2196i0.f12684a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j6 = jArr[i13];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((255 & j6) < 128) {
                                    c2415v.m3952z(objArr[(i13 << 3) + i15]);
                                }
                                j6 >>= 8;
                            }
                            if (i14 != 8) {
                            }
                        }
                        if (i13 != length) {
                            i13++;
                        }
                    }
                }
                return c1694m;
            default:
                C2395p c2395p = ((C3645b) obj3).f17422e;
                C2338a2 c2338a2 = c2395p.f13490c;
                boolean z7 = c2395p.f13469C;
                Collection collection = C1813u.f10860e;
                if (z7) {
                    C2429z1 m3720c = c2338a2.m3720c();
                    int i16 = 0;
                    while (i16 < c2338a2.f13330f) {
                        try {
                            if (m3720c.m3999l(i16)) {
                                Object m4001n = m3720c.m4001n(i16);
                                if (m4001n != obj2) {
                                    if (m4001n instanceof C2420w1) {
                                        c2420w12 = (C2420w1) m4001n;
                                    } else {
                                        c2420w12 = null;
                                    }
                                    if (c2420w12 != null) {
                                        interfaceC2417v12 = c2420w12.f13625a;
                                    } else {
                                        interfaceC2417v12 = null;
                                    }
                                    if (interfaceC2417v12 == obj2) {
                                    }
                                }
                                C3650g c3650g2 = new C3650g(i16, null);
                                m3720c.m3990c();
                                c3650g = c3650g2;
                                if (c3650g != null) {
                                    int i17 = c3650g.f17426a;
                                    Integer num = c3650g.f17427b;
                                    if (c2395p.f13469C) {
                                        try {
                                            collection = AbstractC2072e.m3348z(c2338a2.m3720c(), i17, num);
                                        } finally {
                                        }
                                    }
                                    return AbstractC1805m.m3058v0(collection, c2395p.m3840H());
                                }
                                return collection;
                            }
                            int[] iArr = m3720c.f13638b;
                            int m3733c = AbstractC2346c2.m3733c(iArr, i16);
                            int i18 = i16 + 1;
                            if (i18 < m3720c.f13639c) {
                                i7 = iArr[(i18 * 5) + 4];
                            } else {
                                i7 = m3720c.f13641e;
                            }
                            int i19 = i7 - m3733c;
                            for (int i20 = 0; i20 < i19; i20++) {
                                Object m3995h = m3720c.m3995h(i16, i20);
                                if (m3995h != obj2) {
                                    if (m3995h instanceof C2420w1) {
                                        c2420w1 = (C2420w1) m3995h;
                                    } else {
                                        c2420w1 = null;
                                    }
                                    if (c2420w1 != null) {
                                        interfaceC2417v1 = c2420w1.f13625a;
                                    } else {
                                        interfaceC2417v1 = null;
                                    }
                                    if (interfaceC2417v1 != obj2) {
                                    }
                                }
                                c3650g = new C3650g(i16, Integer.valueOf(i20));
                                if (c3650g != null) {
                                }
                            }
                            i16 = i18;
                        } finally {
                        }
                    }
                    if (c3650g != null) {
                    }
                } else {
                    return collection;
                }
        }
    }

    public /* synthetic */ C0320e(C1196q0 c1196q0, C0800d9 c0800d9, C1195q c1195q) {
        this.f1122e = 2;
        this.f1123f = c0800d9;
        this.f1124g = c1195q;
    }
}
