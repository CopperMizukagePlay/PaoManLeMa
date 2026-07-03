package p008b;

import android.content.Context;
import android.os.Bundle;
import com.paoman.lema.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3382y;
import p172w3.C3781e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C0233g {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f917a;

    public /* synthetic */ C0233g(MainActivity mainActivity) {
        this.f917a = mainActivity;
    }

    /* renamed from: a */
    public final void m509a(Context context) {
        AbstractC3367j.m5100e(context, "it");
        MainActivity mainActivity = this.f917a;
        Bundle m5777b = ((C3781e) mainActivity.f952h.f17918c).m5777b("android:support:activity-result");
        if (m5777b != null) {
            C0243l c0243l = mainActivity.f956l;
            LinkedHashMap linkedHashMap = c0243l.f940b;
            LinkedHashMap linkedHashMap2 = c0243l.f939a;
            Bundle bundle = c0243l.f945g;
            ArrayList<Integer> integerArrayList = m5777b.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = m5777b.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = m5777b.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (stringArrayList2 != null) {
                    c0243l.f942d.addAll(stringArrayList2);
                }
                Bundle bundle2 = m5777b.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                int size = stringArrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    String str = stringArrayList.get(i7);
                    if (linkedHashMap.containsKey(str)) {
                        Integer num = (Integer) linkedHashMap.remove(str);
                        if (!bundle.containsKey(str)) {
                            AbstractC3382y.m5110a(linkedHashMap2).remove(num);
                        }
                    }
                    Integer num2 = integerArrayList.get(i7);
                    AbstractC3367j.m5099d(num2, "get(...)");
                    int intValue = num2.intValue();
                    String str2 = stringArrayList.get(i7);
                    AbstractC3367j.m5099d(str2, "get(...)");
                    String str3 = str2;
                    linkedHashMap2.put(Integer.valueOf(intValue), str3);
                    c0243l.f940b.put(str3, Integer.valueOf(intValue));
                }
            }
        }
    }
}
