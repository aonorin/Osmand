/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class ResourcesManager {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ResourcesManager(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ResourcesManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OsmAndCoreJNI.delete_ResourcesManager(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class Resource {
    private long swigCPtr;
    private boolean swigCMemOwn;
  
    protected Resource(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(Resource obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OsmAndCoreJNI.delete_ResourcesManager_Resource(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
      static public class Metadata {
        private long swigCPtr;
        private boolean swigCMemOwn;
      
        protected Metadata(long cPtr, boolean cMemoryOwn) {
          swigCMemOwn = cMemoryOwn;
          swigCPtr = cPtr;
        }
      
        protected static long getCPtr(Metadata obj) {
          return (obj == null) ? 0 : obj.swigCPtr;
        }
      
        protected void finalize() {
          delete();
        }
      
        public synchronized void delete() {
          if (swigCPtr != 0) {
            if (swigCMemOwn) {
              swigCMemOwn = false;
              OsmAndCoreJNI.delete_ResourcesManager_Resource_Metadata(swigCPtr);
            }
            swigCPtr = 0;
          }
        }
      
        public Metadata() {
          this(OsmAndCoreJNI.new_ResourcesManager_Resource_Metadata(), true);
        }
      
      }
  
    public String getId() {
      return OsmAndCoreJNI.ResourcesManager_Resource_id_get(swigCPtr, this);
    }
  
    public ResourcesManager.ResourceType getType() {
      return ResourcesManager.ResourceType.swigToEnum(OsmAndCoreJNI.ResourcesManager_Resource_type_get(swigCPtr, this));
    }
  
    public ResourcesManager.ResourceOrigin getOrigin() {
      return ResourcesManager.ResourceOrigin.swigToEnum(OsmAndCoreJNI.ResourcesManager_Resource_origin_get(swigCPtr, this));
    }
  
    public ResourcesManager.Resource.Metadata getMetadata() {
      long cPtr = OsmAndCoreJNI.ResourcesManager_Resource_metadata_get(swigCPtr, this);
      return (cPtr == 0) ? null : new ResourcesManager.Resource.Metadata(cPtr, true);
    }
  
  }

  static public class LocalResource extends ResourcesManager.Resource {
    private long swigCPtr;
    private boolean swigCMemOwnDerived;
  
    protected LocalResource(long cPtr, boolean cMemoryOwn) {
      super(OsmAndCoreJNI.ResourcesManager_LocalResource_SWIGSmartPtrUpcast(cPtr), true);
      swigCMemOwnDerived = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(LocalResource obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          OsmAndCoreJNI.delete_ResourcesManager_LocalResource(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public String getLocalPath() {
      return OsmAndCoreJNI.ResourcesManager_LocalResource_localPath_get(swigCPtr, this);
    }
  
    public java.math.BigInteger getSize() {
      return OsmAndCoreJNI.ResourcesManager_LocalResource_size_get(swigCPtr, this);
    }
  
  }

  static public class UnmanagedResource extends ResourcesManager.LocalResource {
    private long swigCPtr;
    private boolean swigCMemOwnDerived;
  
    protected UnmanagedResource(long cPtr, boolean cMemoryOwn) {
      super(OsmAndCoreJNI.ResourcesManager_UnmanagedResource_SWIGSmartPtrUpcast(cPtr), true);
      swigCMemOwnDerived = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(UnmanagedResource obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          OsmAndCoreJNI.delete_ResourcesManager_UnmanagedResource(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public String getName() {
      return OsmAndCoreJNI.ResourcesManager_UnmanagedResource_name_get(swigCPtr, this);
    }
  
  }

  static public class InstalledResource extends ResourcesManager.LocalResource {
    private long swigCPtr;
    private boolean swigCMemOwnDerived;
  
    protected InstalledResource(long cPtr, boolean cMemoryOwn) {
      super(OsmAndCoreJNI.ResourcesManager_InstalledResource_SWIGSmartPtrUpcast(cPtr), true);
      swigCMemOwnDerived = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(InstalledResource obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          OsmAndCoreJNI.delete_ResourcesManager_InstalledResource(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public java.math.BigInteger getTimestamp() {
      return OsmAndCoreJNI.ResourcesManager_InstalledResource_timestamp_get(swigCPtr, this);
    }
  
  }

  static public class BuiltinResource extends ResourcesManager.Resource {
    private long swigCPtr;
    private boolean swigCMemOwnDerived;
  
    protected BuiltinResource(long cPtr, boolean cMemoryOwn) {
      super(OsmAndCoreJNI.ResourcesManager_BuiltinResource_SWIGSmartPtrUpcast(cPtr), true);
      swigCMemOwnDerived = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(BuiltinResource obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          OsmAndCoreJNI.delete_ResourcesManager_BuiltinResource(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
  }

  static public class ResourceInRepository extends ResourcesManager.Resource {
    private long swigCPtr;
    private boolean swigCMemOwnDerived;
  
    protected ResourceInRepository(long cPtr, boolean cMemoryOwn) {
      super(OsmAndCoreJNI.ResourcesManager_ResourceInRepository_SWIGSmartPtrUpcast(cPtr), true);
      swigCMemOwnDerived = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ResourceInRepository obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          OsmAndCoreJNI.delete_ResourcesManager_ResourceInRepository(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public SWIGTYPE_p_QUrl getUrl() {
      return new SWIGTYPE_p_QUrl(OsmAndCoreJNI.ResourcesManager_ResourceInRepository_url_get(swigCPtr, this), true);
    }
  
    public java.math.BigInteger getSize() {
      return OsmAndCoreJNI.ResourcesManager_ResourceInRepository_size_get(swigCPtr, this);
    }
  
    public java.math.BigInteger getTimestamp() {
      return OsmAndCoreJNI.ResourcesManager_ResourceInRepository_timestamp_get(swigCPtr, this);
    }
  
    public java.math.BigInteger getPackageSize() {
      return OsmAndCoreJNI.ResourcesManager_ResourceInRepository_packageSize_get(swigCPtr, this);
    }
  
  }

  static public class ObfMetadata extends ResourcesManager.Resource.Metadata {
    private long swigCPtr;
    private boolean swigCMemOwnDerived;
  
    protected ObfMetadata(long cPtr, boolean cMemoryOwn) {
      super(OsmAndCoreJNI.ResourcesManager_ObfMetadata_SWIGSmartPtrUpcast(cPtr), true);
      swigCMemOwnDerived = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ObfMetadata obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          OsmAndCoreJNI.delete_ResourcesManager_ObfMetadata(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public ObfMetadata(ObfFile obfFile) {
      this(OsmAndCoreJNI.new_ResourcesManager_ObfMetadata(ObfFile.getCPtr(obfFile), obfFile), true);
    }
  
    public ObfFile getObfFile() {
      long cPtr = OsmAndCoreJNI.ResourcesManager_ObfMetadata_obfFile_get(swigCPtr, this);
      return (cPtr == 0) ? null : new ObfFile(cPtr, true);
    }
  
  }

  static public class MapStyleMetadata extends ResourcesManager.Resource.Metadata {
    private long swigCPtr;
    private boolean swigCMemOwnDerived;
  
    protected MapStyleMetadata(long cPtr, boolean cMemoryOwn) {
      super(OsmAndCoreJNI.ResourcesManager_MapStyleMetadata_SWIGSmartPtrUpcast(cPtr), true);
      swigCMemOwnDerived = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(MapStyleMetadata obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          OsmAndCoreJNI.delete_ResourcesManager_MapStyleMetadata(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public MapStyleMetadata(SWIGTYPE_p_std__shared_ptrT_OsmAnd__UnresolvedMapStyle_t mapStyle) {
      this(OsmAndCoreJNI.new_ResourcesManager_MapStyleMetadata(SWIGTYPE_p_std__shared_ptrT_OsmAnd__UnresolvedMapStyle_t.getCPtr(mapStyle)), true);
    }
  
    public SWIGTYPE_p_std__shared_ptrT_OsmAnd__UnresolvedMapStyle_t getMapStyle() {
      long cPtr = OsmAndCoreJNI.ResourcesManager_MapStyleMetadata_mapStyle_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_std__shared_ptrT_OsmAnd__UnresolvedMapStyle_t(cPtr, false);
    }
  
  }

  static public class MapStylesPresetsMetadata extends ResourcesManager.Resource.Metadata {
    private long swigCPtr;
    private boolean swigCMemOwnDerived;
  
    protected MapStylesPresetsMetadata(long cPtr, boolean cMemoryOwn) {
      super(OsmAndCoreJNI.ResourcesManager_MapStylesPresetsMetadata_SWIGSmartPtrUpcast(cPtr), true);
      swigCMemOwnDerived = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(MapStylesPresetsMetadata obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          OsmAndCoreJNI.delete_ResourcesManager_MapStylesPresetsMetadata(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public MapStylesPresetsMetadata(MapStylesPresetsCollection presets) {
      this(OsmAndCoreJNI.new_ResourcesManager_MapStylesPresetsMetadata(MapStylesPresetsCollection.getCPtr(presets), presets), true);
    }
  
    public MapStylesPresetsCollection getPresets() {
      long cPtr = OsmAndCoreJNI.ResourcesManager_MapStylesPresetsMetadata_presets_get(swigCPtr, this);
      return (cPtr == 0) ? null : new MapStylesPresetsCollection(cPtr, true);
    }
  
  }

  static public class OnlineTileSourcesMetadata extends ResourcesManager.Resource.Metadata {
    private long swigCPtr;
    private boolean swigCMemOwnDerived;
  
    protected OnlineTileSourcesMetadata(long cPtr, boolean cMemoryOwn) {
      super(OsmAndCoreJNI.ResourcesManager_OnlineTileSourcesMetadata_SWIGSmartPtrUpcast(cPtr), true);
      swigCMemOwnDerived = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(OnlineTileSourcesMetadata obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          OsmAndCoreJNI.delete_ResourcesManager_OnlineTileSourcesMetadata(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public OnlineTileSourcesMetadata(OnlineTileSources sources) {
      this(OsmAndCoreJNI.new_ResourcesManager_OnlineTileSourcesMetadata(OnlineTileSources.getCPtr(sources), sources), true);
    }
  
    public OnlineTileSources getSources() {
      long cPtr = OsmAndCoreJNI.ResourcesManager_OnlineTileSourcesMetadata_sources_get(swigCPtr, this);
      return (cPtr == 0) ? null : new OnlineTileSources(cPtr, true);
    }
  
  }

  public ResourcesManager(String localStoragePath, String userStoragePath, QStringList readonlyExternalStoragePaths, String miniBasemapFilename, String localTemporaryPath, String repositoryBaseUrl) {
    this(OsmAndCoreJNI.new_ResourcesManager__SWIG_0(localStoragePath, userStoragePath, QStringList.getCPtr(readonlyExternalStoragePaths), readonlyExternalStoragePaths, miniBasemapFilename, localTemporaryPath, repositoryBaseUrl), true);
  }

  public ResourcesManager(String localStoragePath, String userStoragePath, QStringList readonlyExternalStoragePaths, String miniBasemapFilename, String localTemporaryPath) {
    this(OsmAndCoreJNI.new_ResourcesManager__SWIG_1(localStoragePath, userStoragePath, QStringList.getCPtr(readonlyExternalStoragePaths), readonlyExternalStoragePaths, miniBasemapFilename, localTemporaryPath), true);
  }

  public ResourcesManager(String localStoragePath, String userStoragePath, QStringList readonlyExternalStoragePaths, String miniBasemapFilename) {
    this(OsmAndCoreJNI.new_ResourcesManager__SWIG_2(localStoragePath, userStoragePath, QStringList.getCPtr(readonlyExternalStoragePaths), readonlyExternalStoragePaths, miniBasemapFilename), true);
  }

  public ResourcesManager(String localStoragePath, String userStoragePath, QStringList readonlyExternalStoragePaths) {
    this(OsmAndCoreJNI.new_ResourcesManager__SWIG_3(localStoragePath, userStoragePath, QStringList.getCPtr(readonlyExternalStoragePaths), readonlyExternalStoragePaths), true);
  }

  public ResourcesManager(String localStoragePath, String userStoragePath) {
    this(OsmAndCoreJNI.new_ResourcesManager__SWIG_4(localStoragePath, userStoragePath), true);
  }

  public ResourcesManager(String localStoragePath) {
    this(OsmAndCoreJNI.new_ResourcesManager__SWIG_5(localStoragePath), true);
  }

  public String getLocalStoragePath() {
    return OsmAndCoreJNI.ResourcesManager_localStoragePath_get(swigCPtr, this);
  }

  public String getUserStoragePath() {
    return OsmAndCoreJNI.ResourcesManager_userStoragePath_get(swigCPtr, this);
  }

  public QStringList getReadonlyExternalStoragePaths() {
    long cPtr = OsmAndCoreJNI.ResourcesManager_readonlyExternalStoragePaths_get(swigCPtr, this);
    return (cPtr == 0) ? null : new QStringList(cPtr, false);
  }

  public String getMiniBasemapFilename() {
    return OsmAndCoreJNI.ResourcesManager_miniBasemapFilename_get(swigCPtr, this);
  }

  public String getLocalTemporaryPath() {
    return OsmAndCoreJNI.ResourcesManager_localTemporaryPath_get(swigCPtr, this);
  }

  public String getRepositoryBaseUrl() {
    return OsmAndCoreJNI.ResourcesManager_repositoryBaseUrl_get(swigCPtr, this);
  }

  public ResourcesManager.Resource getResource(String id) {
    long cPtr = OsmAndCoreJNI.ResourcesManager_getResource(swigCPtr, this, id);
    return (cPtr == 0) ? null : new ResourcesManager.Resource(cPtr, true);
  }

  public SWIGTYPE_p_QHashT_QString_std__shared_ptrT_OsmAnd__ResourcesManager__BuiltinResource_const_t_t getBuiltInResources() {
    return new SWIGTYPE_p_QHashT_QString_std__shared_ptrT_OsmAnd__ResourcesManager__BuiltinResource_const_t_t(OsmAndCoreJNI.ResourcesManager_getBuiltInResources(swigCPtr, this), true);
  }

  public ResourcesManager.BuiltinResource getBuiltInResource(String id) {
    long cPtr = OsmAndCoreJNI.ResourcesManager_getBuiltInResource(swigCPtr, this, id);
    return (cPtr == 0) ? null : new ResourcesManager.BuiltinResource(cPtr, true);
  }

  public boolean isBuiltInResource(String id) {
    return OsmAndCoreJNI.ResourcesManager_isBuiltInResource(swigCPtr, this, id);
  }

  public boolean rescanUnmanagedStoragePaths() {
    return OsmAndCoreJNI.ResourcesManager_rescanUnmanagedStoragePaths(swigCPtr, this);
  }

  public SWIGTYPE_p_QHashT_QString_std__shared_ptrT_OsmAnd__ResourcesManager__LocalResource_const_t_t getLocalResources() {
    return new SWIGTYPE_p_QHashT_QString_std__shared_ptrT_OsmAnd__ResourcesManager__LocalResource_const_t_t(OsmAndCoreJNI.ResourcesManager_getLocalResources(swigCPtr, this), true);
  }

  public ResourcesManager.LocalResource getLocalResource(String id) {
    long cPtr = OsmAndCoreJNI.ResourcesManager_getLocalResource(swigCPtr, this, id);
    return (cPtr == 0) ? null : new ResourcesManager.LocalResource(cPtr, true);
  }

  public boolean isLocalResource(String id) {
    return OsmAndCoreJNI.ResourcesManager_isLocalResource(swigCPtr, this, id);
  }

  public boolean isRepositoryAvailable() {
    return OsmAndCoreJNI.ResourcesManager_isRepositoryAvailable(swigCPtr, this);
  }

  public boolean updateRepository() {
    return OsmAndCoreJNI.ResourcesManager_updateRepository(swigCPtr, this);
  }

  public SWIGTYPE_p_QHashT_QString_std__shared_ptrT_OsmAnd__ResourcesManager__ResourceInRepository_const_t_t getResourcesInRepository() {
    return new SWIGTYPE_p_QHashT_QString_std__shared_ptrT_OsmAnd__ResourcesManager__ResourceInRepository_const_t_t(OsmAndCoreJNI.ResourcesManager_getResourcesInRepository(swigCPtr, this), true);
  }

  public ResourcesManager.ResourceInRepository getResourceInRepository(String id) {
    long cPtr = OsmAndCoreJNI.ResourcesManager_getResourceInRepository(swigCPtr, this, id);
    return (cPtr == 0) ? null : new ResourcesManager.ResourceInRepository(cPtr, true);
  }

  public boolean isResourceInRepository(String id) {
    return OsmAndCoreJNI.ResourcesManager_isResourceInRepository(swigCPtr, this, id);
  }

  public boolean isResourceInstalled(String id) {
    return OsmAndCoreJNI.ResourcesManager_isResourceInstalled(swigCPtr, this, id);
  }

  public boolean uninstallResource(String id) {
    return OsmAndCoreJNI.ResourcesManager_uninstallResource(swigCPtr, this, id);
  }

  public boolean installFromFile(String filePath, ResourcesManager.ResourceType resourceType) {
    return OsmAndCoreJNI.ResourcesManager_installFromFile__SWIG_0(swigCPtr, this, filePath, resourceType.swigValue());
  }

  public boolean installFromFile(String id, String filePath, ResourcesManager.ResourceType resourceType) {
    return OsmAndCoreJNI.ResourcesManager_installFromFile__SWIG_1(swigCPtr, this, id, filePath, resourceType.swigValue());
  }

  public boolean installFromRepository(String id, SWIGTYPE_p_WebClient__RequestProgressCallbackSignature downloadProgressCallback) {
    return OsmAndCoreJNI.ResourcesManager_installFromRepository__SWIG_0(swigCPtr, this, id, SWIGTYPE_p_WebClient__RequestProgressCallbackSignature.getCPtr(downloadProgressCallback));
  }

  public boolean installFromRepository(String id) {
    return OsmAndCoreJNI.ResourcesManager_installFromRepository__SWIG_1(swigCPtr, this, id);
  }

  public boolean installFromRepository(String id, String filePath) {
    return OsmAndCoreJNI.ResourcesManager_installFromRepository__SWIG_2(swigCPtr, this, id, filePath);
  }

  public boolean isInstalledResourceOutdated(String id) {
    return OsmAndCoreJNI.ResourcesManager_isInstalledResourceOutdated(swigCPtr, this, id);
  }

  public SWIGTYPE_p_QHashT_QString_std__shared_ptrT_OsmAnd__ResourcesManager__LocalResource_const_t_t getOutdatedInstalledResources() {
    return new SWIGTYPE_p_QHashT_QString_std__shared_ptrT_OsmAnd__ResourcesManager__LocalResource_const_t_t(OsmAndCoreJNI.ResourcesManager_getOutdatedInstalledResources(swigCPtr, this), true);
  }

  public boolean updateFromFile(String filePath) {
    return OsmAndCoreJNI.ResourcesManager_updateFromFile__SWIG_0(swigCPtr, this, filePath);
  }

  public boolean updateFromFile(String id, String filePath) {
    return OsmAndCoreJNI.ResourcesManager_updateFromFile__SWIG_1(swigCPtr, this, id, filePath);
  }

  public boolean updateFromRepository(String id, SWIGTYPE_p_WebClient__RequestProgressCallbackSignature downloadProgressCallback) {
    return OsmAndCoreJNI.ResourcesManager_updateFromRepository__SWIG_0(swigCPtr, this, id, SWIGTYPE_p_WebClient__RequestProgressCallbackSignature.getCPtr(downloadProgressCallback));
  }

  public boolean updateFromRepository(String id) {
    return OsmAndCoreJNI.ResourcesManager_updateFromRepository__SWIG_1(swigCPtr, this, id);
  }

  public boolean updateFromRepository(String id, String filePath) {
    return OsmAndCoreJNI.ResourcesManager_updateFromRepository__SWIG_2(swigCPtr, this, id, filePath);
  }

  static public class ILocalResourcesChanged {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected ILocalResourcesChanged(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ILocalResourcesChanged obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OsmAndCoreJNI.delete_ResourcesManager_ILocalResourcesChanged(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    protected void swigDirectorDisconnect() {
      swigCMemOwn = false;
      delete();
    }
  
    public void swigReleaseOwnership() {
      swigCMemOwn = false;
      OsmAndCoreJNI.ResourcesManager_ILocalResourcesChanged_change_ownership(this, swigCPtr, false);
    }
  
    public void swigTakeOwnership() {
      swigCMemOwn = true;
      OsmAndCoreJNI.ResourcesManager_ILocalResourcesChanged_change_ownership(this, swigCPtr, true);
    }
  
    public ILocalResourcesChanged() {
      this(OsmAndCoreJNI.new_ResourcesManager_ILocalResourcesChanged(), true);
      OsmAndCoreJNI.ResourcesManager_ILocalResourcesChanged_director_connect(this, swigCPtr, swigCMemOwn, true);
    }
  
    public void method(ResourcesManager resourcesManager, QStringList added, QStringList removed, QStringList updated) {
      OsmAndCoreJNI.ResourcesManager_ILocalResourcesChanged_method(swigCPtr, this, ResourcesManager.getCPtr(resourcesManager), resourcesManager, QStringList.getCPtr(added), added, QStringList.getCPtr(removed), removed, QStringList.getCPtr(updated), updated);
    }
  
    public boolean attachTo(SWIGTYPE_p_OsmAnd__ObservableAsT_OsmAnd__ResourcesManager__ILocalResourcesChanged_t observable, SWIGTYPE_p_OsmAnd__ObservableAsT_OsmAnd__ResourcesManager__ILocalResourcesChanged_t__Tag tag) {
      return OsmAndCoreJNI.ResourcesManager_ILocalResourcesChanged_attachTo(swigCPtr, this, SWIGTYPE_p_OsmAnd__ObservableAsT_OsmAnd__ResourcesManager__ILocalResourcesChanged_t.getCPtr(observable), SWIGTYPE_p_OsmAnd__ObservableAsT_OsmAnd__ResourcesManager__ILocalResourcesChanged_t__Tag.getCPtr(tag));
    }
  
    public SWIGTYPE_p_OsmAnd__ResourcesManager__LocalResourcesChanged getBinding() {
      return new SWIGTYPE_p_OsmAnd__ResourcesManager__LocalResourcesChanged(OsmAndCoreJNI.ResourcesManager_ILocalResourcesChanged_getBinding(swigCPtr, this), true);
    }
  
  }

  public SWIGTYPE_p_OsmAnd__ObservableAsT_OsmAnd__ResourcesManager__LocalResourcesChanged_t getLocalResourcesChangeObservable() {
    long cPtr = OsmAndCoreJNI.ResourcesManager_localResourcesChangeObservable_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_OsmAnd__ObservableAsT_OsmAnd__ResourcesManager__LocalResourcesChanged_t(cPtr, false);
  }

  static public class IRepositoryUpdated {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected IRepositoryUpdated(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(IRepositoryUpdated obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OsmAndCoreJNI.delete_ResourcesManager_IRepositoryUpdated(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    protected void swigDirectorDisconnect() {
      swigCMemOwn = false;
      delete();
    }
  
    public void swigReleaseOwnership() {
      swigCMemOwn = false;
      OsmAndCoreJNI.ResourcesManager_IRepositoryUpdated_change_ownership(this, swigCPtr, false);
    }
  
    public void swigTakeOwnership() {
      swigCMemOwn = true;
      OsmAndCoreJNI.ResourcesManager_IRepositoryUpdated_change_ownership(this, swigCPtr, true);
    }
  
    public IRepositoryUpdated() {
      this(OsmAndCoreJNI.new_ResourcesManager_IRepositoryUpdated(), true);
      OsmAndCoreJNI.ResourcesManager_IRepositoryUpdated_director_connect(this, swigCPtr, swigCMemOwn, true);
    }
  
    public void method(ResourcesManager resourcesManager) {
      OsmAndCoreJNI.ResourcesManager_IRepositoryUpdated_method(swigCPtr, this, ResourcesManager.getCPtr(resourcesManager), resourcesManager);
    }
  
    public boolean attachTo(SWIGTYPE_p_OsmAnd__ObservableAsT_OsmAnd__ResourcesManager__IRepositoryUpdated_t observable, SWIGTYPE_p_OsmAnd__ObservableAsT_OsmAnd__ResourcesManager__IRepositoryUpdated_t__Tag tag) {
      return OsmAndCoreJNI.ResourcesManager_IRepositoryUpdated_attachTo(swigCPtr, this, SWIGTYPE_p_OsmAnd__ObservableAsT_OsmAnd__ResourcesManager__IRepositoryUpdated_t.getCPtr(observable), SWIGTYPE_p_OsmAnd__ObservableAsT_OsmAnd__ResourcesManager__IRepositoryUpdated_t__Tag.getCPtr(tag));
    }
  
    public SWIGTYPE_p_OsmAnd__ResourcesManager__RepositoryUpdated getBinding() {
      return new SWIGTYPE_p_OsmAnd__ResourcesManager__RepositoryUpdated(OsmAndCoreJNI.ResourcesManager_IRepositoryUpdated_getBinding(swigCPtr, this), true);
    }
  
  }

  public SWIGTYPE_p_OsmAnd__ObservableAsT_OsmAnd__ResourcesManager__RepositoryUpdated_t getRepositoryUpdateObservable() {
    long cPtr = OsmAndCoreJNI.ResourcesManager_repositoryUpdateObservable_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_OsmAnd__ObservableAsT_OsmAnd__ResourcesManager__RepositoryUpdated_t(cPtr, false);
  }

  public IOnlineTileSources getOnlineTileSources() {
    long cPtr = OsmAndCoreJNI.ResourcesManager_onlineTileSources_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IOnlineTileSources(cPtr, true);
  }

  public IMapStylesCollection getMapStylesCollection() {
    long cPtr = OsmAndCoreJNI.ResourcesManager_mapStylesCollection_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IMapStylesCollection(cPtr, true);
  }

  public IMapStylesPresetsCollection getMapStylesPresetsCollection() {
    long cPtr = OsmAndCoreJNI.ResourcesManager_mapStylesPresetsCollection_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IMapStylesPresetsCollection(cPtr, true);
  }

  public IObfsCollection getObfsCollection() {
    long cPtr = OsmAndCoreJNI.ResourcesManager_obfsCollection_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IObfsCollection(cPtr, true);
  }

  public enum ResourceType {
    Unknown(OsmAndCoreJNI.ResourcesManager_ResourceType_Unknown_get()),
    MapRegion,
    VoicePack,
    MapStyle,
    MapStylesPresets,
    OnlineTileSources;

    public final int swigValue() {
      return swigValue;
    }

    public static ResourceType swigToEnum(int swigValue) {
      ResourceType[] swigValues = ResourceType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (ResourceType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + ResourceType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private ResourceType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private ResourceType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private ResourceType(ResourceType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum ResourceOrigin {
    Builtin,
    Installed,
    Repository,
    Unmanaged;

    public final int swigValue() {
      return swigValue;
    }

    public static ResourceOrigin swigToEnum(int swigValue) {
      ResourceOrigin[] swigValues = ResourceOrigin.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (ResourceOrigin swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + ResourceOrigin.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private ResourceOrigin() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private ResourceOrigin(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private ResourceOrigin(ResourceOrigin swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
