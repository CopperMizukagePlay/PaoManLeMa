package p039e5;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p024c6.AbstractC0450q;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3470q;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.j8 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0987j8 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f5035e;

    /* renamed from: f */
    public final /* synthetic */ int f5036f;

    /* renamed from: g */
    public final /* synthetic */ Object f5037g;

    /* renamed from: h */
    public final /* synthetic */ Object f5038h;

    public /* synthetic */ C0987j8(int i7, int i8, Object obj, Object obj2) {
        this.f5035e = i8;
        this.f5037g = obj;
        this.f5036f = i7;
        this.f5038h = obj2;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        String group;
        Double m964F;
        double doubleValue;
        double d7;
        String str;
        Double m964F2;
        int i7 = this.f5035e;
        boolean z7 = true;
        C1694m c1694m = C1694m.f10482a;
        int i8 = this.f5036f;
        Object obj = this.f5038h;
        Object obj2 = this.f5037g;
        switch (i7) {
            case 0:
                C3469p c3469p = (C3469p) obj2;
                c3469p.remove(i8);
                AbstractC1249rm.m2216E0((Context) obj, AbstractC3470q.m5264e(c3469p).f16763c);
                return c1694m;
            case 1:
                C2349d1 c2349d1 = (C2349d1) obj;
                int i9 = i8 + 1;
                int m3066N = AbstractC1806n.m3066N((List) ((InterfaceC2425y0) obj2).getValue());
                if (i9 > m3066N) {
                    i9 = m3066N;
                }
                c2349d1.m3742h(i9);
                return c1694m;
            case 2:
                ((InterfaceC3281e) obj2).mo22d(Integer.valueOf(i8), (C1006jr) obj);
                return c1694m;
            case 3:
                C2349d1 c2349d12 = (C2349d1) obj;
                int i10 = i8 + 1;
                int m3066N2 = AbstractC1806n.m3066N((List) obj2);
                if (i10 > m3066N2) {
                    i10 = m3066N2;
                }
                float f7 = AbstractC1092mk.f5952h;
                c2349d12.m3742h(i10);
                return c1694m;
            default:
                Process exec = Runtime.getRuntime().exec((String[]) obj2);
                AbstractC3367j.m5097b(exec);
                ((C1001jm) obj).getClass();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                try {
                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                        sb.append(readLine);
                        sb.append('\n');
                    }
                    bufferedReader.close();
                    bufferedReader = new BufferedReader(new InputStreamReader(exec.getErrorStream()));
                    try {
                        for (String readLine2 = bufferedReader.readLine(); readLine2 != null; readLine2 = bufferedReader.readLine()) {
                            sb.append(readLine2);
                            sb.append('\n');
                        }
                        bufferedReader.close();
                        String sb2 = sb.toString();
                        AbstractC3367j.m5099d(sb2, "toString(...)");
                        exec.waitFor();
                        Matcher matcher = Pattern.compile("(?i)time\\s*=\\s*([0-9.]+)\\s*ms").matcher(sb2);
                        if (matcher.find()) {
                            String group2 = matcher.group(1);
                            if (group2 != null && (m964F2 = AbstractC0450q.m964F(group2)) != null) {
                                doubleValue = m964F2.doubleValue();
                            }
                            doubleValue = 0.0d;
                        } else {
                            Matcher matcher2 = Pattern.compile("(?i)rtt[^=]*=\\s*[0-9.]+/([0-9.]+)/").matcher(sb2);
                            if (matcher2.find() && (group = matcher2.group(1)) != null && (m964F = AbstractC0450q.m964F(group)) != null) {
                                doubleValue = m964F.doubleValue();
                            }
                            doubleValue = 0.0d;
                        }
                        if (exec.exitValue() != 0 || doubleValue <= 0.0d) {
                            z7 = false;
                        }
                        boolean z8 = z7;
                        if (z8) {
                            d7 = doubleValue;
                        } else {
                            d7 = 0.0d;
                        }
                        if (z8) {
                            str = ((int) doubleValue) + " ms";
                        } else {
                            str = "超时";
                        }
                        return new C1094mm(this.f5036f, z8, d7, str);
                    } finally {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ C0987j8(int i7, Object obj, C2349d1 c2349d1, int i8) {
        this.f5035e = i8;
        this.f5036f = i7;
        this.f5037g = obj;
        this.f5038h = c2349d1;
    }

    public /* synthetic */ C0987j8(String[] strArr, C1001jm c1001jm, int i7) {
        this.f5035e = 4;
        this.f5037g = strArr;
        this.f5038h = c1001jm;
        this.f5036f = i7;
    }
}
