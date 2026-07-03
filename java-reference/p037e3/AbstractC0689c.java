package p037e3;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p012b3.AbstractC0276d;
import p060h5.AbstractC1793a0;
import p077k.C2213r;
import p102n1.AbstractC2710c;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e3.c */
/* loaded from: classes.dex */
public abstract class AbstractC0689c {

    /* renamed from: a */
    public static final C2213r f2236a = new C2213r(2);

    /* renamed from: b */
    public static final C0687a f2237b = new C0687a(0);

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (p012b3.AbstractC0276d.m611a(r5) == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        r0.add(new p037e3.C0692f[]{new p037e3.C0692f(r4, r3.f2243f)});
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0691e m1473a(Context context, List list) {
        AbstractC3393k.m5137h("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                C0690d c0690d = (C0690d) list.get(i7);
                if (Build.VERSION.SDK_INT >= 31) {
                    String str = c0690d.f2242e;
                    AbstractC2710c abstractC2710c = AbstractC0276d.f1019a;
                    Typeface typeface = null;
                    if (str != null && !str.isEmpty()) {
                        Typeface create = Typeface.create(str, 0);
                        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
                        if (create != null && !create.equals(create2)) {
                            typeface = create;
                        }
                    }
                }
                ProviderInfo m1474b = m1474b(context.getPackageManager(), c0690d, context.getResources());
                if (m1474b == null) {
                    return new C0691e(0);
                }
                arrayList.add(m1475c(context, c0690d, m1474b.authority));
            }
            return new C0691e(0, arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, e3.b] */
    /* renamed from: b */
    public static ProviderInfo m1474b(PackageManager packageManager, C0690d c0690d, Resources resources) {
        C0687a c0687a = f2237b;
        C2213r c2213r = f2236a;
        AbstractC3393k.m5137h("FontProvider.getProvider");
        try {
            List list = c0690d.f2241d;
            String str = c0690d.f2238a;
            String str2 = c0690d.f2239b;
            if (list == null) {
                list = AbstractC1793a0.m2968H(resources, 0);
            }
            ?? obj = new Object();
            obj.f2233a = str;
            obj.f2234b = str2;
            obj.f2235c = list;
            ProviderInfo providerInfo = (ProviderInfo) c2213r.m3623a(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(str2)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    Collections.sort(arrayList, c0687a);
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i7));
                        Collections.sort(arrayList2, c0687a);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i8), (byte[]) arrayList2.get(i8))) {
                                    break;
                                }
                            }
                            c2213r.m3624b(obj, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    Trace.endSection();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: c */
    public static C0692f[] m1475c(Context context, C0690d c0690d, String str) {
        int i7;
        int i8;
        Uri withAppendedId;
        int i9;
        boolean z7;
        AbstractC3393k.m5137h("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC3393k.m5137h("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {c0690d.f2240c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e7) {
                            Log.w("FontsProvider", "Unable to query the content provider", e7);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i7 = cursor.getInt(columnIndex);
                            } else {
                                i7 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i8 = cursor.getInt(columnIndex4);
                            } else {
                                i8 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = withAppendedId;
                            if (columnIndex5 != -1) {
                                i9 = cursor.getInt(columnIndex5);
                            } else {
                                i9 = 400;
                            }
                            int i10 = i9;
                            if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            arrayList2.add(new C0692f(uri, i8, i10, z7, c0690d.f2243f, i7));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (C0692f[]) arrayList.toArray(new C0692f[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
