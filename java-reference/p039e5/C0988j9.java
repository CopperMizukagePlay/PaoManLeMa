package p039e5;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.Toast;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p024c6.AbstractC0434a;
import p053g5.C1689h;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1817y;
import p068i5.AbstractC2080d;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.j9 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0988j9 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f5039e;

    /* renamed from: f */
    public final /* synthetic */ Context f5040f;

    public /* synthetic */ C0988j9(Context context, int i7) {
        this.f5039e = i7;
        this.f5040f = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019b  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map, java.lang.Object] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo23f(Object obj) {
        Object m2985m;
        boolean booleanValue;
        String str;
        String m2351a;
        OutputStream openOutputStream;
        Object m2985m2;
        boolean booleanValue2;
        InputStream openInputStream;
        Activity activity = null;
        boolean z7 = true;
        switch (this.f5039e) {
            case 0:
                Context context = this.f5040f;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    C0927h9.f4481a.m1555b(context, uri);
                }
                return C1694m.f10482a;
            case 1:
                Context context2 = this.f5040f;
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    C0927h9.f4481a.m1555b(context2, uri2);
                }
                return C1694m.f10482a;
            case 2:
                C0927h9.f4481a.m1556d(this.f5040f, new C0863f9(1, ((Boolean) obj).booleanValue()));
                break;
            case 3:
                Context context3 = this.f5040f;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                C0927h9.f4481a.m1554a(context3);
                C1701c0 c1701c0 = C0927h9.f4482b;
                if (!((C0959i9) c1701c0.getValue()).f4789k || !booleanValue3) {
                    z7 = false;
                }
                context3.getSharedPreferences("downloader_settings", 0).edit().putBoolean("pure_mode", booleanValue3).putBoolean("auto_start_downloads", z7).apply();
                c1701c0.m2752j(null, C0959i9.m1601a((C0959i9) c1701c0.getValue(), null, booleanValue3, null, 0, 0, null, 0, 0, null, false, z7, 0, 3069));
                break;
            case 4:
                C0927h9.f4481a.m1556d(this.f5040f, new C0863f9(0, ((Boolean) obj).booleanValue()));
                break;
            case AbstractC3122c.f15761f /* 5 */:
                Context context4 = this.f5040f;
                Uri uri3 = (Uri) obj;
                if (uri3 != null) {
                    Object obj2 = AbstractC1312tn.f7833a;
                    AbstractC3367j.m5100e(context4, "context");
                    try {
                        m2351a = AbstractC1312tn.m2351a(context4);
                        openOutputStream = context4.getContentResolver().openOutputStream(uri3);
                    } catch (Throwable th) {
                        m2985m = AbstractC1793a0.m2985m(th);
                    }
                    if (openOutputStream != null) {
                        try {
                            byte[] bytes = m2351a.getBytes(AbstractC0434a.f1477a);
                            AbstractC3367j.m5099d(bytes, "getBytes(...)");
                            openOutputStream.write(bytes);
                            openOutputStream.close();
                            m2985m = Boolean.TRUE;
                            Object obj3 = Boolean.FALSE;
                            if (m2985m instanceof C1689h) {
                                m2985m = obj3;
                            }
                            booleanValue = ((Boolean) m2985m).booleanValue();
                            if (!booleanValue) {
                                str = "设置已导出";
                            } else {
                                str = "设置导出失败";
                            }
                            Toast.makeText(context4, str, 0).show();
                        } finally {
                        }
                    } else {
                        booleanValue = false;
                        if (!booleanValue) {
                        }
                        Toast.makeText(context4, str, 0).show();
                    }
                }
                return C1694m.f10482a;
            default:
                Context context5 = this.f5040f;
                Uri uri4 = (Uri) obj;
                if (uri4 != null) {
                    Object obj4 = AbstractC1312tn.f7833a;
                    AbstractC3367j.m5100e(context5, "context");
                    try {
                        openInputStream = context5.getContentResolver().openInputStream(uri4);
                    } catch (Throwable th2) {
                        m2985m2 = AbstractC1793a0.m2985m(th2);
                    }
                    if (openInputStream != null) {
                        try {
                            String str2 = new String(AbstractC2080d.m3375C(openInputStream), AbstractC0434a.f1477a);
                            openInputStream.close();
                            Map m2354d = AbstractC1312tn.m2354d(str2);
                            if (m2354d != null) {
                                if (!m2354d.isEmpty()) {
                                    Iterator it = m2354d.entrySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Map.Entry entry = (Map.Entry) it.next();
                                            String str3 = (String) entry.getKey();
                                            Map map = (Map) entry.getValue();
                                            Set set = (Set) AbstractC1817y.m3081M(str3, AbstractC1312tn.f7833a);
                                            SharedPreferences sharedPreferences = context5.getSharedPreferences(str3, 0);
                                            SharedPreferences.Editor edit = sharedPreferences.edit();
                                            Set<String> keySet = sharedPreferences.getAll().keySet();
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj5 : keySet) {
                                                if (!set.contains((String) obj5)) {
                                                    arrayList.add(obj5);
                                                }
                                            }
                                            int size = arrayList.size();
                                            int i7 = 0;
                                            while (i7 < size) {
                                                Object obj6 = arrayList.get(i7);
                                                i7++;
                                                edit.remove((String) obj6);
                                            }
                                            for (Map.Entry entry2 : map.entrySet()) {
                                                String str4 = (String) entry2.getKey();
                                                Object value = entry2.getValue();
                                                AbstractC3367j.m5097b(edit);
                                                AbstractC1312tn.m2355e(edit, str4, value);
                                            }
                                            if (!edit.commit()) {
                                                z7 = false;
                                            }
                                        }
                                    }
                                }
                                AbstractC1249rm.m2273m0(context5);
                                m2985m2 = Boolean.valueOf(z7);
                                Object obj7 = Boolean.FALSE;
                                if (m2985m2 instanceof C1689h) {
                                    m2985m2 = obj7;
                                }
                                booleanValue2 = ((Boolean) m2985m2).booleanValue();
                                if (!booleanValue2) {
                                    C0927h9 c0927h9 = C0927h9.f4481a;
                                    synchronized (c0927h9) {
                                        C0927h9.f4484d = false;
                                    }
                                    Context applicationContext = context5.getApplicationContext();
                                    AbstractC3367j.m5099d(applicationContext, "getApplicationContext(...)");
                                    c0927h9.m1554a(applicationContext);
                                    Toast.makeText(context5, "设置已导入，正在刷新界面", 0).show();
                                    Context context6 = context5;
                                    while (true) {
                                        if (context6 instanceof Activity) {
                                            activity = (Activity) context6;
                                        } else if (context6 instanceof ContextWrapper) {
                                            Context baseContext = ((ContextWrapper) context6).getBaseContext();
                                            AbstractC3367j.m5099d(baseContext, "getBaseContext(...)");
                                            context6 = baseContext;
                                        }
                                    }
                                    if (activity != null) {
                                        activity.recreate();
                                    }
                                } else {
                                    Toast.makeText(context5, "无法识别设置文件", 0).show();
                                }
                            }
                        } finally {
                        }
                    }
                    booleanValue2 = false;
                    if (!booleanValue2) {
                    }
                }
                return C1694m.f10482a;
        }
        return C1694m.f10482a;
    }
}
