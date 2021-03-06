package com.volmit.secretary.util;

public class MavenArtifact
{
	private String artifactId;
	private String groupId;
	private String version;

	public MavenArtifact(String def)
	{
		this(def.split("\\Q:\\E")[0], def.split("\\Q:\\E")[1], def.split("\\Q:\\E")[2]);
	}

	public MavenArtifact(String artifactId, String groupId, String version)
	{
		this.artifactId = artifactId;
		this.groupId = groupId;
		this.version = version;
	}

	public String getArtifactId()
	{
		return artifactId;
	}

	public void setArtifactId(String artifactId)
	{
		this.artifactId = artifactId;
	}

	public String getGroupId()
	{
		return groupId;
	}

	public void setGroupId(String groupId)
	{
		this.groupId = groupId;
	}

	public String getVersion()
	{
		return version;
	}

	public void setVersion(String version)
	{
		this.version = version;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artifactId == null) ? 0 : artifactId.hashCode());
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}

		if(obj == null)
		{
			return false;
		}

		if(!(obj instanceof MavenArtifact))
		{
			return false;
		}

		MavenArtifact other = (MavenArtifact) obj;

		if(artifactId == null)
		{
			if(other.artifactId != null)
			{
				return false;
			}
		}

		else if(!artifactId.equals(other.artifactId))
		{
			return false;
		}

		if(groupId == null)
		{
			if(other.groupId != null)
			{
				return false;
			}
		}

		else if(!groupId.equals(other.groupId))
		{
			return false;
		}

		if(version == null)
		{
			if(other.version != null)
			{
				return false;
			}
		}

		else if(!version.equals(other.version))
		{
			return false;
		}

		return true;
	}

	@Override
	public String toString()
	{
		return groupId + ":" + artifactId + ":" + version;
	}
}
