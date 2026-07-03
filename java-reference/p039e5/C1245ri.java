package p039e5;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ri */
/* loaded from: classes.dex */
public final /* synthetic */ class C1245ri implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f7362e = 1;

    /* renamed from: f */
    public final /* synthetic */ Context f7363f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f7364g;

    public /* synthetic */ C1245ri(Context context, InterfaceC2425y0 interfaceC2425y0) {
        this.f7363f = context;
        this.f7364g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        LinkedHashSet m2964D;
        int i7 = this.f7362e;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f7364g;
        Context context = this.f7363f;
        switch (i7) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                String str = (String) obj2;
                AbstractC3367j.m5100e(str, "value");
                if (intValue >= 0) {
                    float f7 = AbstractC1092mk.f5952h;
                    if (intValue < ((List) interfaceC2425y0.getValue()).size()) {
                        ArrayList m3036D0 = AbstractC1805m.m3036D0((List) interfaceC2425y0.getValue());
                        m3036D0.set(intValue, str);
                        interfaceC2425y0.setValue(m3036D0);
                        AbstractC1092mk.m1687J2(context, interfaceC2425y0);
                    }
                }
                return c1694m;
            default:
                EnumC1269sb enumC1269sb = (EnumC1269sb) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                AbstractC3367j.m5100e(enumC1269sb, "section");
                EnumC1269sb enumC1269sb2 = EnumC1269sb.f7545j;
                if (enumC1269sb != enumC1269sb2) {
                    if (booleanValue) {
                        float f8 = AbstractC1092mk.f5952h;
                        m2964D = AbstractC1793a0.m2966F((Set) interfaceC2425y0.getValue(), enumC1269sb);
                    } else {
                        float f9 = AbstractC1092mk.f5952h;
                        m2964D = AbstractC1793a0.m2964D((Set) interfaceC2425y0.getValue(), enumC1269sb);
                    }
                    interfaceC2425y0.setValue(m2964D);
                    Set set = (Set) interfaceC2425y0.getValue();
                    SharedPreferences.Editor edit = context.getSharedPreferences("speed_test_profiles", 0).edit();
                    LinkedHashSet m2966F = AbstractC1793a0.m2966F(set, enumC1269sb2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = m2966F.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(((EnumC1269sb) it.next()).name());
                    }
                    edit.putStringSet("visible_home_sections", linkedHashSet).apply();
                }
                return c1694m;
        }
    }

    public /* synthetic */ C1245ri(InterfaceC2425y0 interfaceC2425y0, Context context) {
        this.f7364g = interfaceC2425y0;
        this.f7363f = context;
    }
}
